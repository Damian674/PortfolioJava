<%-- 
    Document   : editarOdontologo
    Created on : Jun 21, 2024, 11:59:29 AM
    Author     : Damian
--%>

<%@page import="logica.Odontologo"%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>

<h1>Edicion de Odontologo</h1>
<p>Este es un apartado para modificar un Odontologo del sistema</p>
<% Odontologo odo = (Odontologo) request.getSession().getAttribute("odoEditar"); %>

                            <form class="user" action="SvEditOdontologos" method="POST">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="dni" name="dni"
                                               placeholder="dni" value="<%=odo.getDni()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombre" name="nombre"
                                               placeholder="nombre" value="<%=odo.getNombre()%>">
                                    </div>                              
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="apellido" name="apellido"
                                               placeholder="apellido" value="<%=odo.getApellido()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="telefono" name="telefono"
                                               placeholder="telefono" value="<%=odo.getTelefono()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="direccion" name="direccion"
                                               placeholder="direccion" value="<%=odo.getDireccion()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="fecha_nac" name="fecha_nac"
                                               placeholder="fecha_nac" value="<%=odo.getFecha_nac()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="especialidad" name="especialidad"
                                               placeholder="especialidad" value="<%=odo.getEspecialidad()%>">
                                    </div>
                                    
                                </div>
                                <button class="btn btn-primary btn-user btn-block" type="submit">
                                    Guardar Modificacion
                                </button>
                                
                            </form>

<%@include file="components/bodyfinal.jsp" %>
