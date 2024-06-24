<%-- 
    Document   : altas
    Created on : Jun 14, 2024, 4:00:05 PM
    Author     : Damian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>

<h1>Alta Odontologos</h1>

                            <form class="user" action="SvAltaOdontologos" method="POST">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="dni" name="dni"
                                            placeholder="DNI">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombre" name="nombre"
                                            placeholder="NOMBRE">
                                    </div>                              
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="apellido" name="apellido"
                                            placeholder="APELLIDO">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="telefono" name="telefono"
                                            placeholder="TELEFONO">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="direccion" name="direccion"
                                            placeholder="DIRECCION">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="fechanac" name="fecha_nac"
                                            placeholder="FECHA NAC">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="especialidad" name="especialidad"
                                            placeholder="ESPECIALIDAD">
                                    </div>
                                    
                                    <!--aca va a ir todo lo que respecta a horarios y usuarios-->
                                    
                                </div>
                                <button class="btn btn-primary btn-user btn-block" type="submit">
                                    Crear Odontologo
                                </button>
                                
                            </form>

<%@include file="components/bodyfinal.jsp" %>
