<%-- 
    Document   : catDispositivosMoviles_form
    Created on : 08/01/2013, 10:53:48 AM
    Author     : Leonardo Montes de Oca, leonarzeta@hotmail.com
--%>

<%@page import="com.tsp.gespro.bo.EmpresaBO"%>
<%@page import="com.tsp.gespro.bo.EmpresaBO"%>
<%@page import="com.tsp.gespro.bo.RolesBO"%>
<!---------------<//%@page import="com.tsp.microfinancieras.dto.SgfensClienteVendedor"%>-->
<!---------------<//%@page import="com.tsp.microfinancieras.bo.SGClienteVendedorBO"%>-->
<!---------------<//%@page import="com.tsp.microfinancieras.bo.RolesBO"%>-->
<%@page import="com.tsp.gespro.bo.UsuarioBO"%>
<%@page import="com.tsp.gespro.bo.PasswordBO"%>
<%@page import="com.tsp.gespro.bo.DispositivoMovilBO"%>
<%@page import="com.tsp.gespro.jdbc.DispositivoMovilDaoImpl"%>
<%@page import="com.tsp.gespro.dto.DispositivoMovil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" scope="session" class="com.tsp.gespro.bo.UsuarioBO"/>

<%
//Verifica si el cliente tiene acceso a este topico
    if (user == null || !user.permissionToTopicByURL(request.getRequestURI().replace(request.getContextPath(), ""))) {
        response.sendRedirect("../../jsp/inicio/login.jsp?action=loginRequired&urlSource=" + request.getRequestURI() + "?" + request.getQueryString());
        response.flushBuffer();
    } else {
        
        int paginaActual = 1;
        try{
            paginaActual = Integer.parseInt(request.getParameter("pagina"));
        }catch(Exception e){}

        int idEmpresa = user.getUser().getIdEmpresa();
        
        /*
         * Parámetros
         */
        int idDispositivoMovil = 0;
        try {
            idDispositivoMovil = Integer.parseInt(request.getParameter("idDispositivoMovil"));
        } catch (NumberFormatException e) {
        }

        /*
         *   0/"" = nuevo
         *   1 = editar/consultar
         *   2 = eliminar  
         */
        String mode = request.getParameter("acc") != null ? request.getParameter("acc") : "";
        String newRandomPass = "";
        
        DispositivoMovilBO dispositivoMovilBO = new DispositivoMovilBO(user.getConn());
        DispositivoMovil dispositivosMovilesDto = null;
        if (idDispositivoMovil > 0){
            dispositivoMovilBO = new DispositivoMovilBO(idDispositivoMovil,user.getConn());
            dispositivosMovilesDto = dispositivoMovilBO.getDispositivoMovil();
        }else{
            newRandomPass = new PasswordBO().generateValidPassword();
        }
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link rel="shortcut icon" href="../../images/favicon.ico">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="../include/keyWordSEO.jsp" />

        <title><jsp:include page="../include/titleApp.jsp" /></title>

        <jsp:include page="../include/skinCSS.jsp" />

        <jsp:include page="../include/jsFunctions.jsp"/>
        
        <script type="text/javascript">
            
            function grabar(){
                if(validar()){
                    $.ajax({
                        type: "POST",
                        url: "catDispositivosMoviles_ajax.jsp",
                        data: $("#frm_action").serialize(),
                        beforeSend: function(objeto){
                            $("#action_buttons").fadeOut("slow");
                            $("#ajax_loading").html('<div style=""><center>Procesando...<br/><img src="../../images/ajax_loader.gif" alt="Cargando.." /></center></div>');
                            $("#ajax_loading").fadeIn("slow");
                        },
                        success: function(datos){
                            if(datos.indexOf("--EXITO-->", 0)>0){
                               $("#ajax_message").html(datos);
                               $("#ajax_loading").fadeOut("slow");
                               $("#ajax_message").fadeIn("slow");
                               apprise('<center><img src=../../images/info.png> <br/>'+ datos +'</center>',{'animate':true},
                                        function(r){
                                            location.href = "catDispositivosMoviles_list.jsp?pagina="+"<%=paginaActual%>";
                                        });
                           }else{
                               $("#ajax_loading").fadeOut("slow");
                               $("#ajax_message").html(datos);
                               $("#ajax_message").fadeIn("slow");
                               $("#action_buttons").fadeIn("slow");
                               $.scrollTo('#inner',800);
                           }
                        }
                    });
                }
            }

            function validar(){
                /*
                if(jQuery.trim($("#nombre").val())==""){
                    apprise('<center><img src=../../images/warning.png> <br/>El dato "nombre de contacto" es requerido</center>',{'animate':true});
                    $("#nombre_contacto").focus();
                    return false;
                }
                */
                return true;
            }
            
        </script>
    </head>
    <body>
        <div class="content_wrapper">

            <jsp:include page="../include/header.jsp" flush="true"/>

            <jsp:include page="../include/leftContent.jsp"/>

            <!-- Inicio de Contenido -->
            <div id="content">

                <div class="inner">
                    <h1>Catálogo</h1>

                    <div id="ajax_loading" class="alert_info" style="display: none;"></div>
                    <div id="ajax_message" class="alert_warning" style="display: none;"></div>

                    <!--TODO EL CONTENIDO VA AQUÍ-->
                    <form action="" method="post" id="frm_action">
                    <div class="twocolumn">
                        <div class="column_left">
                            <div class="header">
                                <span>
                                    <img src="../../images/icon_phone.png" alt="icon"/>
                                    <% if(dispositivosMovilesDto!=null){%>
                                    Editar Dispositivo Movil ID <%=dispositivosMovilesDto!=null?dispositivosMovilesDto.getIdDispositivo():"" %>
                                    <%}else{%>
                                    Dispositivo Movil
                                    <%}%>
                                </span>
                            </div>
                            <br class="clear"/>
                            <div class="content">
                                    <input type="hidden" id="idDispositivoMovil" name="idDispositivoMovil" value="<%=dispositivosMovilesDto!=null?dispositivosMovilesDto.getIdDispositivo():"" %>" />
                                    <input type="hidden" id="mode" name="mode" value="<%=mode%>" />
                                    <p>
                                        <label>*IMEI</label><br/>
                                        <input maxlength="15" type="text" id="imeiDispositivoMovil" name="imeiDispositivoMovil" style="width:300px"
                                               value="<%=dispositivosMovilesDto!=null?dispositivoMovilBO.getDispositivoMovil().getImei():"" %>"/>
                                    </p>
                                    <br/>
                                    <p>
                                        <label>Marca:</label><br/>
                                        <input maxlength="100" type="text" id="marcaDispositivoMovil" name="marcaDispositivoMovil" style="width:300px"
                                               value="<%=dispositivosMovilesDto!=null?dispositivoMovilBO.getDispositivoMovil().getMarca():"" %>"/>
                                    </p>
                                    <br/>                                                                        
                                    <p>
                                        <label>Modelo:</label><br/>
                                        <input maxlength="100" type="text" id="modeloDispositivoMovil" name="modeloDispositivoMovil" style="width:300px"
                                               value="<%=dispositivosMovilesDto!=null?dispositivoMovilBO.getDispositivoMovil().getModelo():"" %>"/>
                                    </p>
                                    <br/>
                                    <p>
                                        <label>Numero de Serie:</label><br/>
                                        <input maxlength="50" type="text" id="numSerieDispositivoMovil" name="numSerieDispositivoMovil" style="width:300px"
                                               value="<%=dispositivosMovilesDto!=null?dispositivoMovilBO.getDispositivoMovil().getNumeroSerie():"" %>"/>
                                    </p>
                                    <br/>
                                    <p>
                                        <label>Alias del Movil:</label><br/>
                                        <input maxlength="150" type="text" id="aliasDispositivoMovil" name="aliasDispositivoMovil" style="width:300px"
                                               value="<%=dispositivosMovilesDto!=null?dispositivoMovilBO.getDispositivoMovil().getAliasTelefono():"" %>"/>
                                    </p>
                                    <br/>
                                    <%// if(user.getUser().getIdRol() == RolesBO.ROL_ADMINISTRADOR_SISTEMA){%>
                                    <p>
                                        <label>Asignar a Empresa/Sucursal:</label><br/>
                                        <select size="1" id="idSucursalEmpresaAsignado" name="idSucursalEmpresaAsignado">
                                            <option value="-1">Selecciona una Sucursal</option>
                                                <%
                                                    out.print(new EmpresaBO(user.getConn()).getEmpresasByIdHTMLCombo(idEmpresa, (dispositivosMovilesDto!=null?dispositivoMovilBO.getDispositivoMovil().getIdEmpresa():-1) ));                                                    
                                                %>
                                        </select>                                        
                                    </p> 
                                    <br/> 
                                    <%//}%>
                                    <!--<p>
                                        <input type="checkbox" class="checkbox" <%=dispositivosMovilesDto!=null?(dispositivosMovilesDto.getAsignado()==1?"checked":""):"unchecked" %> id="asignadoDispositivoMovil" name="asignadoDispositivoMovil" value="0" readonly="true"> <label for="asignadoDispositivoMovil">Asignado</label>
                                    </p>-->
                                    
                                    <p>
                                        <input type="checkbox" class="checkbox" <%=dispositivosMovilesDto!=null?(dispositivosMovilesDto.getIdEstatus()==1?"checked":""):"checked" %> id="estatus" name="estatus" value="1"> <label for="estatus">Activo</label>
                                    </p>
                                    <br/><br/>
                                    
                                    <div id="action_buttons">
                                        <p>
                                            <input type="button" id="enviar" value="Guardar" onclick="grabar();"/>
                                            <input type="button" id="regresar" value="Regresar" onclick="history.back();"/>
                                        </p>
                                    </div>
                                    
                            </div>
                        </div>
                        <!-- End left column window -->
                        
                        
                    </div>
                    </form>
                    <!--TODO EL CONTENIDO VA AQUÍ-->

                </div>

                <jsp:include page="../include/footer.jsp"/>
            </div>
            <!-- Fin de Contenido-->
        </div>


    </body>
</html>
<%}%>