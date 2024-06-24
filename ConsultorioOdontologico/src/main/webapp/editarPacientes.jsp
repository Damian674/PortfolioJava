<%-- 
    Document   : editarOdontologo
    Created on : Jun 21, 2024, 11:59:29 AM
    Author     : Damian
--%>

<%@page import="logica.Paciente"%>
<%@page import="logica.Odontologo"%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>

<h1>Edicion de Paciente</h1>
<p>Este es un apartado para modificar un Paciente del sistema</p>
<% Paciente pacien = (Paciente) request.getSession().getAttribute("pacienEditar"); %>

                            <form class="user" action="SvEditPacientes" method="POST">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="dni" name="dni"
                                               placeholder="dni" value="<%=pacien.getDni()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombre" name="nombre"
                                               placeholder="nombre" value="<%=pacien.getNombre()%>">
                                    </div>                              
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="apellido" name="apellido"
                                               placeholder="apellido" value="<%=pacien.getApellido()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="telefono" name="telefono"
                                               placeholder="telefono" value="<%=pacien.getTelefono()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="direccion" name="direccion"
                                               placeholder="direccion" value="<%=pacien.getDireccion()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="fecha_nac" name="fecha_nac"
                                               placeholder="fecha_nac" value="<%=pacien.getFecha_nac()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="tiene_os" name="tiene_os"
                                               placeholder="tiene_os" value="<%=pacien.getTiene_OS()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="tipo_sangre" name="tipo_sangre"
                                               placeholder="tipo_sangre" value="<%=pacien.getTipoSangre()%>">
                                    </div>
                                    
                                </div>
                                <button class="btn btn-primary btn-user btn-block" type="submit">
                                    Guardar Modificacion
                                </button>
                                
                            </form>

<%@include file="components/bodyfinal.jsp" %>
