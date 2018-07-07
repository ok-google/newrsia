<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />

	<section class="section">
        <div class="row sameheight-container">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="card card-block sameheight-item">
                    <div class="title-block">
                        <h3 class="title"> Data Penjualan </h3>
                    </div>
                    <button type="button" id="add_detail" class="btn btn-success btn-sm" data-toggle="modal"
                    data-target="#form-detail">Tambah</button>
                    <form:form modelAttribute="jualModel" method="POST" action="/jual/store" id="jual-form">
                    <div class="form-group">
                            <button type="button" id="simpan-jual" class="btn btn-primary">Simpan</button>
                        </div>
                        <div class="form-group">
                            <label>No</label>
                            <form:input path="jualNo" placeholder="Masukan Nomer" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Tanggal jual</label>
                            <form:input path="jual_tanggal" type="text" placeholder="Masukan Tgl Penjualan" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Pendafataran Nomer</label>
                            <form:input path="jualPendaftaranNo" placeholder="Masukan Nomer Pendaftaran" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Pasien</label>
                            <form:input path="jualPasienId" type="text" placeholder="Masukan Pasien Id" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Alamat Pasien</label>
                            <form:input path="jualPasienAlamat" type="text" placeholder="Masukan Pasien Id" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Pegawai</label>
                            <form:input path="jualPegawaiId" type="text" placeholder="Masukan Tgl Penjualan" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Dokter</label>
                            <form:input path="jualDokterId" placeholder="Masukan Nomer Pendaftaran" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Diskon</label>
                            <form:input path="jualDiskon" type="text" placeholder="Masukan Pasien Id" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Total</label>
                            <form:input path="jualTotal" type="text" placeholder="Masukan Tgl Penjualan" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Bayar</label>
                            <form:input path="jualBayarId" placeholder="Masukan Nomer Pendaftaran" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Jumlah Bayar</label>
                            <form:input path="jualBayarJumlah" type="text" placeholder="Masukan Pasien Id" class="form-control"/>
                         </div>
                         <%--
                         <div class="form-group">
                            <label>Status</label>
                            <form:input path="jualStatus" type="text" placeholder="Masukan Pasien Id" class="form-control"/>
                         </div>
                         --%>
                         <div class="form-group">
                         <div class="card-block" style="background-color: #f4f4f4">
                               <div class="table-responsive" style="overflow-y: auto;">
                                   <table class="table table-striped table-bjualed table-hover table-form">
                                       <thead>
                                           <tr>
                                               <th>Nama Barang</th>
                                               <th>Satuan</th>
                                               <th>Jumlah</th>
                                               <th>Harga</th>
                                               <th>Sub Total</th>
                                               <th>Aksi</th>
                                               
                                           </tr>
                                       </thead>
                                       <tbody id="jual-list">
                                       </tbody>
                                   </table>
                               </div>
                           </div>
                           </div>
                    </form:form>
                </div>
            </div>
        </div>
	</section>
    <div class="modal fade" id="form-detail" role="dialog">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
            	<div class="modal-header">
                     <h4 class="modal-title">Tambah jual Barang</h4>
                     <button type="button" class="close" data-dismiss="modal"
                         aria-label="Close">
                         <span aria-hidden="true">�</span> <span class="sr-only">Close</span>
                     </button>
                 </div>
                 <div class="modal-body modal-tab-container">
                     <form>
                         <div class="form-group">
                             <label>Nama Barang</label>
                             <input type="text" name="jualDetailBarangId" id="jualDetailBarangId">
                             
                         </div>
                         <div class="form-group">
                             <label>Satuan</label>
                             <input type="text" name="jualDetailSatuanId" id="jualDetailSatuanId">
                             <%--
                             <select name="jualDetailSatuanId" id="jualDetailSatuanId">
                                 <c:forEach var="tempSatuan" items="${satuan}">
                                         <option value="${tempSatuan.satuan_id }">
                                         ${tempSatuan.satuanNama }
                                         </option>
                                     </c:forEach>
                             </select>
                             ]--%>
                         </div>
                         <div class="form-group">
                             <label>Jumlah</label>
                             <input type="text" name="jualDetailJumlah" id="jualDetailJumlah">
                         </div>
                         <div class="form-group">
                             <label>Harga</label>
                             <input type="text" name="jualDetailHarga" id="jualDetailHarga">
                         </div>
                         <div class="form-group">
                             <label>Sub Total</label>
                             <input type="text" name="jualDetailSubTotal" id="jualDetailSubTotal">
                         </div>
                         <input type="hidden" name="detail_mode" id="detail_mode">                                                                               
                         <input type="hidden" name="detail_edit" id="detail_edit">
                     </form>
                 </div>
                 <div class="modal-footer">
                      <button type="button" class="btn btn-secondary"
                          data-dismiss="modal">Close</button>
                      <button type="button" id="simpan-detail" class="btn btn-primary">Simpan</button>
                  </div>
         	</div>
		<!-- /.modal-content -->
		</div>
	</div>
<jsp:include page="../app/footer.jsp" />