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
                                <button type="button" class="btn btn-sm btn-success d_pasien-button" id="simpan-order" style="float: right;">Simpan</button>
                            </div>
                        </div>
                        <form:form modelAttribute="orderModel" method="POST" action="/order/store" id="order-form">
                        <div class="row card-block">
                            <div class="col-6">
                                <div class="form-group">
                                    <label>No</label>
                                    <form:input path="orderNomer" placeholder="Masukan Nomer Order" class="form-control"/>
                                 </div>
                                
                                <div class="form-group">
                                    <label>Tanggal Order</label>
                                    <form:input path="orderTanggal" type="date" placeholder="Masukan Tgl Order" class="form-control"/>
                                 </div>
                                 
                                 
                                 <div class="form-group">
                                    <label>Jatuh Tempo </label>
                                    <form:input path="orderJatuhTempo" type="date" placeholder="Jatuh tempo" class="form-control"/>
                                 </div>
                                 <div class="form-group">
                                    <label>Perusahaan</label>
                                    <form:input path="orderPerusahaanId" placeholder="Perusahaan" class="form-control"/>
                                 </div>
                                 <div class="form-group">
                                    <label>Diskon</label>
                                    <form:input path="orderDiskon" placeholder="Diskon" class="form-control"/>
                                 </div>
                                 <div class="form-group">
                                    <label>CashBack</label>
                                    <form:input path="orderCashback" placeholder="Cashback" class="form-control"/>
                                 </div>
                                 <div class="form-group">
                                    <label>Total Bayar</label>
                                    <form:input path="orderTotal" placeholder="Total bayar" class="form-control"/>
                                 </div>
                                <div class="form-group">
                                    <label>Jumlah Bayar</label>
                                    <form:input path="orderJumlahBayar" placeholder="Jumlah bayar" class="form-control"/>
                                 </div>
                            </div>

                                <div class="col-6">
                                 <div class="form-group">
                                    <label>TTD Nama</label>
                                    <form:input path="orderTtdNama" placeholder="TTd Nama" class="form-control"/>
                                 </div>
                                 <div class="form-group">
                                    <label>Status</label>
                                    <form:input path="orderStatus" placeholder="Status" class="form-control"/>
                                 </div>
                                 <div class="form-group">
                                    <label>Jabatan</label>
                                    <form:input path="orderTtdJabatanNama" placeholder="Jabatan" class="form-control"/>
                                 </div>
                                 <div class="form-group">
                                    <label>Jenis Barang</label>
                                    <form:input path="orderBarangJenis" placeholder="Jenis Barang" class="form-control"/>
                                 </div>
                                 <div class="form-group">
                                    <label>Group</label>
                                    <form:input path="orderGroup" placeholder="Group" class="form-control"/>
                                 </div>
                                 <div class="form-group">
                                    <label>Keterangan</label>
                                    <form:input path="orderKeterangan" placeholder="Keterangan" class="form-control"/>
                                 </div>
                                 <div class="form-group">
                                    <label>NIP</label>
                                    <form:input path="orderTtdNip" placeholder="NIP" class="form-control"/>
                                 </div>
                                 <div class="form-group">
                                    <label>Order Revised</label>
                                    <form:input path="orderRevised" placeholder="Order Revised" class="form-control"/>
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
                                        id="add_order" data-toggle="modal" data-target="#form-detail">
                                            <span class="fa fa-plus"></span>&nbsp;Tambah
                                        </button>

                                        <div class="table-responsive" style="overflow-y: auto;">
                                            <table class="table table-striped table-bordered table-hover">
                                                <thead>
                                                    <tr>
                                                        <th>Nama Barang</th>
                                                        <th>Satuan</th>
                                                        <th>Harga</th>
                                                        <th>Jumlah</th>
                                                        <th>Subtotal</th>
                                                        <th>Aksi</th>
                                                    </tr>
                                                </thead>
                                                <tbody id="order-list" class="table-form">
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
    <div class="modal fade" id="form-detail" role="dialog">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
            	<div class="modal-header">
                     <h4 class="modal-title">Tambah Order Barang</h4>
                     <button type="button" class="close" data-dismiss="modal"
                         aria-label="Close">
                         <span aria-hidden="true">�</span> <span class="sr-only">Close</span>
                     </button>
                 </div>
                 <div class="modal-body modal-tab-container">
                     <form>
                         <div class="form-group">
                             <label>Nama Barang</label>
                             <input type="text" name="orderDetailBarangId" id="orderDetailBarangId">
                             
                         </div>
                         <div class="form-group">
                             <label>Satuan</label>
                             <input type="text" name="orderDetailSatuanId" id="orderDetailSatuanId">
                             <%--<select name="orderDetailSatuanId" id="orderDetailSatuanId">
                                 <c:forEach var="tempSatuan" items="${satuan}">
                                         <option value="${tempSatuan.satuan_id }">
                                         ${tempSatuan.satuanNama }
                                         </option>
                                     </c:forEach>
                             </select>--%>
                         </div>
                         <div class="form-group">
                             <label>Jumlah</label>
                             <input type="text" name="orderDetailJumlah" id="orderDetailJumlah">
                         </div>
                         <div class="form-group">
                             <label>Harga</label>
                             <input type="text" name="orderDetailHarga" id="orderDetailHarga">
                         </div>
                         <div class="form-group">
                             <label>Sub Total</label>
                             <input type="text" name="orderDetailSubTotal" id="orderDetailSubTotal">
                         </div>
                         <input type="hidden" name="order_mode" id="order_mode">                                                                               
                         <input type="hidden" name="order_edit" id="order_edit">
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