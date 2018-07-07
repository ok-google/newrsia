<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />

	<article class="content forms-page">
        <section class="section">
            <div class="container">
                <div class="row">
                    <div class="col-6">
                        <small>Keterangan : <span style="color:red">*</span> Wajib Diisi</small>
                    </div>
                    <div class="col-6">
                        <button type="button" class="btn btn-sm btn-success d_pasien-button" id="simpan-returbeli" style="float: right;">Simpan</button>
                    </div>
                </div>
                <form:form modelAttribute="returBeliModel" method="POST" action="store" id="returbeli-form">
                <div class="row card-block">
                    <div class="col-6">
                        <div class="form-group">
                            <label>No</label>
                            <form:input path="returBeliNo" placeholder="Masukan Nomer" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Tanggal Retur</label>
                            <form:input path="returBeliTanggal" type="text" placeholder="Masukan Tgl returbeli" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Terima</label>
                            <form:input path="returBeliTerimaId" placeholder="Masukan Nomer" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Supplier</label>
                            <form:input path="returBeliPerusahaanId" type="text" placeholder="Masukan Nama Supplier" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Alamat Perusahaan</label>
                            <form:input path="returBeliPerusahaanAlamat" type="text" placeholder="Masukan Alamat Perusahaan" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Telepon</label>
                            <form:input path="returBeliPerusahaanNoTelp" type="text" placeholder="Masukan Telp Perusahaan" class="form-control"/>
                         </div>
                     </div>
                     
                     <div class="col-6">
                         <div class="form-group">
                            <label>Total</label>
                            <form:input path="returBeliTotal" placeholder="Masukan Nomer" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Group</label>
                            <form:input path="returBeliGroup" type="text" placeholder="Masukan Group" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>PPN</label>
                            <form:input path="returBeliPPN" type="text" placeholder="Masukan PPN" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Total PPN</label>
                            <form:input path="returBeliTotalPPN" type="text" placeholder="Masukan Total PPN" class="form-control"/>
                         </div>
                     </div>
                     
                     <div class="col col-12" style="padding:0">
                            <div class="container">
                                <div class="card card-success">
                                    <div class="card-header" style="min-height:0">
                                        <div class="header-block" style="padding: 5px 20px">
                                            <p class="title"> Detail Barang </p>
                                        </div>
                                    </div>
                                    <div class="card-block" style="background-color: #f4f4f4">
                                        <button type="button" class="btn btn-sm btn-success" style="float: right;"
                                        id="add_detail" data-toggle="modal" data-target="#form-detail">
                                            <span class="fa fa-plus"></span>&nbsp;Tambah
                                        </button>           
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
                                               <tbody id="returbeli-list" class="table-form">
                                               </tbody>
                                           </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </form:form>                        
                    </div>
                </section>
            </article>
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
                             <input type="text" name="ReturBeliDetailBarangId" id="ReturBeliDetailBarangId">
                             
                         </div>
                         <div class="form-group">
                             <label>Satuan</label>
                             <input type="text" name="ReturBeliDetailSatuanId" id="ReturBeliDetailSatuanId">
                             <%--
                             <select name="ReturBeliDetailSatuanId" id="ReturBeliDetailSatuanId">
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
                             <input type="date" name="ReturBeliDetailKadaluarsa" id="ReturBeliDetailKadaluarsa">
                         </div>
                         
                         <div class="form-group">
                             <label>Jumlah</label>
                             <input type="text" name="ReturBeliDetailJumlah" id="ReturBeliDetailJumlah">
                         </div>
                         <div class="form-group">
                             <label>Harga</label>
                             <input type="text" name="ReturBeliDetailHarga" id="ReturBeliDetailHarga">
                         </div>
                         <div class="form-group">
                             <label>Sub Total</label>
                             <input type="text" name="ReturBeliDetailSubTotal" id="ReturBeliDetailSubTotal">
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