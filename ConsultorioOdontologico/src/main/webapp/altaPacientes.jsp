<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>

<h1>Alta Pacientes</h1>

                            <form class="user" action="SvPacientes" method="POST">
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
                                        <input type="text" class="form-control form-control-user" id="tieneos" name="tiene_os"
                                            placeholder="TIENE OS">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="tiposangre" name="tipo_sangre"
                                            placeholder="TIPO SANGRE">
                                    </div>
                                    
                                    <!--aca va a ir todo lo que respecta a horarios y usuarios-->
                                    
                                </div>
                                <button class="btn btn-primary btn-user btn-block" type="submit">
                                    Crear Paciente
                                </button>
                                
                            </form>

<%@include file="components/bodyfinal.jsp" %>
