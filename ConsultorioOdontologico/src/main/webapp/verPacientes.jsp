<%@page import="logica.Paciente"%>
<%@page import="logica.Odontologo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>

<!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Ver Pacientes</h1>
                    <p class="mb-4">A continuacion podra visualizar la lista completa de Pacientes</p>

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Pacientes</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>Id</th>
                                            <th>Dni</th>
                                            <th>Nombre</th>
                                            <th>Apellido</th>
                                            <th>Telefono</th>
                                            <th>Direccion</th>
                                            <th>Fecha Nac</th>
                                            <th>Tiene OS</th>
                                            <th>Tipo Sangre</th>
                                            <th style="width:210px">Accion</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>Id</th>
                                            <th>Dni</th>
                                            <th>Nombre</th>
                                            <th>Apellido</th>
                                            <th>Telefono</th>
                                            <th>Direccion</th>
                                            <th>Fecha Nac</th>
                                            <th>Tiene OS</th>
                                            <th>Tipo Sangre</th>
                                             <th style="width:210px">Accion</th>
                                        </tr>
                                    </tfoot>
                                    
                                    <% List<Paciente> listaPacientes = (List) request.getSession().getAttribute("listaPacientes");%>
                                    <tbody>
                                        <% for(Paciente pacien : listaPacientes) {%>
                                        <tr>
                                            <td><%=pacien.getId()%></td>
                                            <td><%=pacien.getDni() %></td>
                                            <td><%=pacien.getNombre() %></td>
                                            <td><%=pacien.getApellido()%></td>
                                            <td><%=pacien.getTelefono()%></td>
                                            <td><%=pacien.getDireccion()%></td>
                                            <td><%=pacien.getFecha_nac()%></td>
                                            <td><%=pacien.getTiene_OS()%></td>
                                            <td><%=pacien.getTipoSangre()%></td>
                                            <td style="display:flex; width: 230px;">
                                                <form name="eliminar" action="SvElimPacientes" method="POST"> <!-- esto es para mandar codigo al servlet -->
                                                <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right: 5px; ">
                                                    <i class="fas fa-trash-alt"></i> Eliminar 
                                                </button>
                                                    <input type="hidden" name="id" value="<%=pacien.getId()%>"> <!-- Esto para mandar codigo al servlet -->    
                                                </form>
                                                <form name="editar" action="SvEditPacientes" method="GET"> <!-- esto es para mandar codigo al servlet -->
                                                    <button type="submint" class="btn btn-primary btn-user btn-block" style="margin-left: 5px;">
                                                        <i class="fas fa-pencil-alt"></i> Editar
                                                    </button>
                                                    <input type="hidden" name="id" value="<%=pacien.getId()%>"> <!-- esto es para mandar codigo al servlet -->
                                                </form>
                                            </td>
                                        </tr>
                                        <%}%>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->
            
            <!-- Page level plugins -->
    <script src="vendor/datatables/jquery.dataTables.min.js"></script>
    <script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="js/demo/datatables-demo.js"></script>



<%@include file="components/bodyfinal.jsp" %>
