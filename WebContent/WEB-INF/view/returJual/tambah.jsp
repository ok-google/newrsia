<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
<table class="table table-striped table-bordered table-hover">
<section class="section">
        <div class="row sameheight-container">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="card card-block sameheight-item">
                    <div class="title-block">
                        <h3 class="title"> Data Returjual </h3>
                    </div>
                    <button type="button" id="add_detail" class="btn btn-success btn-sm" data-toggle="modal"
                    data-target="#form-detail">Tambah</button>
                    <form:form modelAttribute="returJualModel" method="POST" action="/retur-jual/store" id="returJual-form">
                        <div class="form-group">
                            <button type="button" id="simpan-returJual" class="btn btn-primary">Simpan</button>
                        </div>
                        <div class="form-group">
                            <label>Nomer</label>
                            <form:input path="returJualNo" placeholder="Nomer" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Tanggal Returjual</label>
                            <form:input path="returJualTanggal" type="date" placeholder="tanggal returjual" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Retur Jual</label>
                            <form:input path="returJualJual" placeholder="retur jual" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Pasien Norm</label>
                            <form:input path="returJualPasienNorm" placeholder="pasien norm" class="form-control"/>
                         </div>
                         <div classs="form-group">
                            <label>Nama Pasien</label>
                            <form:input path="returJualPasienNama" placeholder="nama pasien" class="form-control"/>
                         </div><div class="form-group">
                            <label>Alamat</label>
                            <form:input path="returJualPasienAlamat" placeholder="alamat" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Jenis Pasien</label>
                            <form:input path="returJualJenisPasienNama" placeholder="jenis pasien" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Diskon</label>
                            <form:input path="returJualDiskon" placeholder="diskon" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Cashback</label>
                            <form:input path="returJualCashback" placeholder="cashback" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Total</label>
                            <form:input path="returJualTotal" placeholder="total" class="form-control"/>
                         </div>
                        <%--
                        <div class="form-group">
                            <label>Status Bayar</label>
                            <form:input path="returJualBayarStatus" placeholder="status bayar" class="form-control"/>
                         </div>
                         --%>
                        <div class="form-group">
                            <label>Jumlah Bayar</label>
                            <form:input path="returJualBayarJumlah" placeholder="Jumlah Bayar" class="form-control"/>
                         </div>
                        <%--
                        <div class="form-group">
                            <label>Status</label>
                            <form:input path="returjual_status" placeholder="status" class="form-control"/>
                         </div>
                         --%>
                        <div class="form-group">
                            <label>Pembayar</label>
                            <form:input path="returJualBayarNama" placeholder="nama pembayar" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Keterangan</label>
                            <form:input path="returJualKeterangan" placeholder="keterangan" class="form-control"/>
                         </div>
                         <div class="form-group">
                         <div class="card-block" style="background-color: #f4f4f4">
                               <div class="table-responsive" style="overflow-y: auto;">
                                   <table class="table table-striped table-bordered table-hover table-form">
                                       <thead>
                                           <tr>
                                               <th>Nama Barang</th>
                                               <th>Satuan</th>
                                               <th>Kadaluarsa</th>
                                               <th>Jumlah</th>
                                               <th>Harga</th>
                                               <th>Sub Total</th>
                                               <th>Aksi</th>
                                               
                                           </tr>
                                       </thead>
                                       <tbody id="returJual-list">
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
                     <h4 class="modal-title">Tambah Barang Retur Beli</h4>
                     <button type="button" class="close" data-dismiss="modal"
                         aria-label="Close">
                         <span aria-hidden="true">�</span> <span class="sr-only">Close</span>
                     </button>
                 </div>
                 <div class="modal-body modal-tab-container">
                     <form>
                         <div class="form-group">
                             <label>Nama Barang</label>
                             <input type="text" name="ReturJualDetailBarangId" id="ReturJualDetailBarangId">
                             
                         </div>
                         <div class="form-group">
                             <label>Satuan</label>
                             <input type="text" name="ReturJualDetailSatuanId" id="ReturJualDetailSatuanId">
                             <%--
                             <select name="ReturJualDetailSatuanId" id="ReturJualDetailSatuanId">
                                 <c:forEach var="tempSatuan" items="${satuan}">
                                         <option value="${tempSatuan.satuan_id }">
                                         ${tempSatuan.satuanNama }
                                         </option>
                                     </c:forEach>
                             </select>
                             --%>
                         </div>
                         <div class="form-group">
                             <label>Kadaluarsa</label>
                             <input type="date" name="ReturJualDetailKadaluarsa" id="ReturJualDetailKadaluarsa">
                         </div>
                         
                         <div class="form-group">
                             <label>Jumlah</label>
                             <input type="text" name="ReturJualDetailJumlah" id="ReturJualDetailJumlah">
                         </div>
                         <div class="form-group">
                             <label>Harga</label>
                             <input type="text" name="ReturJualDetailHarga" id="ReturJualDetailHarga">
                         </div>
                         <div class="form-group">
                             <label>Sub Total</label>
                             <input type="text" name="ReturJualDetailSubTotal" id="ReturJualDetailSubTotal">
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

        </div>
    </div>
<jsp:include page="../app/footer.jsp" />