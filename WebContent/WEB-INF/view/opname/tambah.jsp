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
                <button type="button" class="btn btn-sm btn-success d_pasien-button" id="simpan-opname" style="float: right;">Simpan</button>
              </div>
            </div>
            <form:form modelAttribute="opnameModel" method="POST" action="store" id="opname-form">
            <div class="row card-block">
              <div class="col-6">
                <div class="form-group">
                    <label>No</label>
                    <form:input path="opnameNo" placeholder="Masukan Nomer" class="form-control"/>
                 </div>
                
                <div class="form-group">
                    <label>Tanggal</label>
                    <form:input path="opnameTanggal" placeholder="Masukan Tanggal" class="form-control"/>
                 </div>
                 
                <div class="form-group">
                    <label>Keterangan</label>
                    <form:input path="opnameKeterangan" type="text" placeholder="Tambah Keterangan" class="form-control"/>
                 </div>

                </div>

                <div class="col-6">
                 
                 <div class="form-group">
                    <label>Depo</label>
                    <form:input path="opnameDepoNama" type="text" placeholder="Masukan Nama Depo" class="form-control"/>
                 </div>
                 
                 <div class="form-group">
                    <label>Group</label>
                    <form:input path="opnameGroup" type="text" placeholder="Masukan Nama Group" class="form-control" />
                 </div>
                 
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
                                       <th>No Terima</th>
                                       <th>Barang</th>
                                       <th>Satuan</th>
                                       <th>Kadaluarsa</th>
                                       <th>Stok Awal</th>
                                       <th>Stok Koreksi</th>
                                       <th>Stok Akhir</th>
                                       <th>Harga</th>
                                       <th>Keterangan</th>
                                       <th>Aksi</th>            
                                   </tr>
                               </thead>
                               <tbody id="opname-list" class="table-form">
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
                     <h4 class="modal-title">Tambah Opname Barang</h4>
                     <button type="button" class="close" data-dismiss="modal"
                         aria-label="Close">
                         <span aria-hidden="true">�</span> <span class="sr-only">Close</span>
                     </button>
                 </div>
                 <div class="modal-body modal-tab-container">
                     <form>
                         <div class="form-group">
                             <label>Nomer Terima</label>
                             <input type="text" name="opnameDetailTerimaNo" id="opnameDetailTerimaNo">
                         </div>
                         
                         <div class="form-group">
                             <label>Barang</label>
                             <input type="text" name="opnameDetailBarangId" id="opnameDetailBarangId">
                         </div>
                         
                         <div class="form-group">
                             <label>Tanggal Kadaluarsa</label>
                             <input type="text" name="opnameDetailKadaluarsa" id="opnameDetailKadaluarsa">
                         </div>
                         
                         <div class="form-group">
                             <label>Satuan</label>
                             <input type="text" name="opnameDetailSatuanId" id="opnameDetailSatuanId">
                             <%--
                             <select name="opnameDetailSatuanId" id="opnameDetailSatuanId">
                                 <c:forEach var="tempSatuan" items="${satuan}">
                                         <option value="${tempSatuan.satuan_id }">
                                         ${tempSatuan.satuanNama }
                                         </option>
                                   </c:forEach>
                             </select>
                             --%>
                         </div>
                         
                         <div class="form-group">
                             <label>Stok Awal</label>
                             <input type="text" name="opnameDetailStokAwal" id="opnameDetailStokAwal">
                         </div>
                         <div class="form-group">
                             <label>Koreksi</label>
                             <input type="text" name="opnameDetailStokKoreksi" id="opnameDetailStokKoreksi">
                         </div>
                         <div class="form-group">
                             <label>Stok Akhir</label>
                             <input type="text" name="opnameDetailStok_akhir" id="opnameDetailStok_akhir">
                         </div>
                         
                         <div class="form-group">
                             <label>Harga</label>
                             <input type="text" name="opnameDetailHarga" id="opnameDetailHarga">
                         </div>
                         <div class="form-group">
                             <label>Keterangan</label>
                             <input type="text" name="opnameDetailKeterangan" id="opnameDetailKeterangan">
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