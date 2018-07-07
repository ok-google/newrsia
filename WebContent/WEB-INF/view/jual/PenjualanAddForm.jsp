<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<title>Transaksi - Penjualan</title>
	<link href="<c:url value="/resources/css/app.css "/>" rel="stylesheet" type="text/css"/>
	<link href="<c:url value="/resources/css/vendor.css "/>" rel="stylesheet" type="text/css"/>
	<link href="<c:url value="/resources/css/app-blue.css "/>" rel="stylesheet" type="text/css"/>
	<link href="<c:url value="/resources/css/style.css "/>" rel="stylesheet" type="text/css"/>
	<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> -->
	<script src="<c:url value="/resources/js/jquery-1.11.3.min.js "/>"></script>
	<!-- <script src="js/jquery.js"></script> -->
</head>

<body>
	<div class="main-wrapper">
		<div class="app" id="app">
			<header class="header">
				<div class="nav-title">
					<h3 class="title">Transaksi</h3><small>Penjaulan</small>
				</div>
				<div class="header-block header-block-collapse d-lg-none d-xl-none">
					<button class="collapse-btn" id="sidebar-collapse-btn">
							<i class="fa fa-bars"></i>
						</button>
				</div>
				<div class="header-block header-block-nav">
					<ul class="nav-profile">
						<li class="notifications new">
							<a href="" data-toggle="dropdown">
									<i class="fa fa-bell-o"></i>
									<sup>
										<span class="counter">8</span>
									</sup>
								</a>
							<div class="dropdown-menu notifications-dropdown-menu">
								<ul class="notifications-container">
									<li>
										<a href="" class="notification-item">
											<div class="img-col">
												<div class="img" style="background-image: url('assets/faces/3.jpg')"></div>
											</div>
											<div class="body-col">
												<p>
													<span class="accent">Zack Alien</span> pushed new commit:
													<span class="accent">Fix page load performance issue</span>. </p>
											</div>
										</a>
									</li>
								</ul>
								<footer>
									<ul>
										<li>
											<a href=""> View All </a>
										</li>
									</ul>
								</footer>
							</div>
						</li>
						<li class="profile dropdown">
							<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
								<div class="img" style="background-image: url('https://avatars3.githubusercontent.com/u/3959008?v=3&s=40')"> </div>
								<span class="name"> John Doe </span>
							</a>
							<div class="dropdown-menu profile-dropdown-menu" aria-labelledby="dropdownMenu1">
								<a class="dropdown-item" href="#">
										<i class="fa fa-user icon"></i> Profile </a>
								<a class="dropdown-item" href="#">
										<i class="fa fa-bell icon"></i> Notifications </a>
								<a class="dropdown-item" href="#">
										<i class="fa fa-gear icon"></i> Settings </a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="login.html">
										<i class="fa fa-power-off icon"></i> Logout </a>
							</div>
						</li>
					</ul>
				</div>
			</header>
			<aside class="sidebar">
				<div class="sidebar-container">
					<div class="sidebar-header">
						<div class="brand">
							<div class="logo">
								<span class="l l1"></span>
								<span class="l l2"></span>
								<span class="l l3"></span>
								<span class="l l4"></span>
								<span class="l l5"></span>
							</div> RSIA Hikmah </div>
					</div>
					<nav class="menu">
						<ul class="sidebar-menu metismenu" id="sidebar-menu">
							<li>
								<a href="index.html">
										<i class="fa fa-home"></i> Dashboard
									</a>
							</li>
							<li>
								<a href="">
										<i class="fa fa-desktop"></i> Transaksi
										<i class="fa arrow"></i>
									</a>
								<ul class="sidebar-nav">
									<li>
										<a href="pendaftaran.html">
											<i class="fa fa-users"></i> Pendaftaran
											</a>
									</li>
									<li>
										<a href="pelayanan.html">
												<i class="fa fa-user-md"></i> &nbsp;Pelayanan
											</a>
									</li>
									<li>
										<a href="pembayaran.html">
												<i class="fa fa-money"></i> Pembayaran
											</a>
									</li>
								</ul>
							</li>
							<li>
								<a href="">
										<i class="fa fa-hdd-o"></i> Master
										<i class="fa arrow"></i>
									</a>
								<ul class="sidebar-nav">
									<li>
										<a href="v_kelas.html"> Kelas </a>
									</li>
									<li>
										<a href="v_agama.html"> Agama </a>
									</li>
									<li>
										<a href="v_pasien.html"> Pasien </a>
									</li>
									<li>
										<a href="v_tindakan.html"> Tindakan </a>
									</li>
									<li>
										<a href="v_paket.html"> Paket </a>
									</li>
									<li class="active">
										<a href="v_kamar.html"> Kamar </a>
									</li>
									<li>
										<a href="v_kondisi_pasien.html"> Kondisi Pasien </a>
									</li>
									<li>
										<a href="v_jenis_rujukan.html"> Jenis Rujukan </a>
									</li>
									<li>
										<a href="v_rujukan.html"> Rujukan </a>
									</li>
									<li>
										<a href="v_rujukan.html"> History Pasien </a>
									</li>
								</ul>
							</li>
						</ul>
					</nav>
				</div>
				<footer class="sidebar-footer">
					<ul class="sidebar-menu metismenu" id="customize-menu">
						<li>
							<ul>
								<li class="customize">
									<div class="customize-item">
										<div class="row customize-header">
											<div class="col-4"> </div>
											<div class="col-4">
												<label class="title">fixed</label>
											</div>
											<div class="col-4">
												<label class="title">static</label>
											</div>
										</div>
										<div class="row">
											<div class="col-4">
												<label class="title">Sidebar:</label>
											</div>
											<div class="col-4">
												<label>
														<input class="radio" type="radio" name="sidebarPosition" value="sidebar-fixed">
														<span></span>
													</label>
											</div>
											<div class="col-4">
												<label>
														<input class="radio" type="radio" name="sidebarPosition" value="">
														<span></span>
													</label>
											</div>
										</div>
										<div class="row">
											<div class="col-4">
												<label class="title">Header:</label>
											</div>
											<div class="col-4">
												<label>
														<input class="radio" type="radio" name="headerPosition" value="header-fixed">
														<span></span>
													</label>
											</div>
											<div class="col-4">
												<label>
														<input class="radio" type="radio" name="headerPosition" value="">
														<span></span>
													</label>
											</div>
										</div>
										<div class="row">
											<div class="col-4">
												<label class="title">Footer:</label>
											</div>
											<div class="col-4">
												<label>
														<input class="radio" type="radio" name="footerPosition" value="footer-fixed">
														<span></span>
													</label>
											</div>
											<div class="col-4">
												<label>
														<input class="radio" type="radio" name="footerPosition" value="">
														<span></span>
													</label>
											</div>
										</div>
									</div>
									<div class="customize-item">
										<ul class="customize-colors">
											<li>
												<span class="color-item color-red" data-theme="red"></span>
											</li>
											<li>
												<span class="color-item color-orange" data-theme="orange"></span>
											</li>
											<li>
												<span class="color-item color-green active" data-theme=""></span>
											</li>
											<li>
												<span class="color-item color-seagreen" data-theme="seagreen"></span>
											</li>
											<li>
												<span class="color-item color-blue" data-theme="blue"></span>
											</li>
											<li>
												<span class="color-item color-purple" data-theme="purple"></span>
											</li>
										</ul>
									</div>
								</li>
							</ul>
							<a href="">
									<i class="fa fa-cog"></i> Customize </a>
						</li>
					</ul>
				</footer>
			</aside>
			<div class="sidebar-overlay" id="sidebar-overlay"></div>
			<div class="sidebar-mobile-menu-handle" id="sidebar-mobile-menu-handle"></div>
			<div class="mobile-menu-handle"></div>
			<article class="content forms-page">
				<section class="section">
					<div class="container">
						<div class="row">
							<div class="col-6">
								<small>Keterangan : <span style="color:red">*</span> Wajib Diisi</small>
							</div>
							<div class="col-6 form-group">
								<button type="button" class="btn btn-sm btn-success d_pasien-button" style="float: right;">
									<span class="fa fa-save"></span> Simpan
								</button>
								<button type="button" class="btn btn-sm btn-secondary d_pasien-button" style="float: right;">
									<span class="fa fa-print"></span> Cetak
								</button>&nbsp;
							</div>
						</div>
						<div class="row card-block">
							<div class="col-6">
								<div class="form-group">
									<label for="exampleInputEmail1">No. Penjualan</label>
									<input type="text" class="form-control boxed form-control-sm" disabled="" value="Auto">
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Tgl. Jual</label>
									<div class="input-group">
										<input type="date" class="form-control boxed form-control-sm">
										<span class="input-group-addon"><span class="fa fa-calendar"></span></span>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label">No. RM</label>
									<select class="form-control boxed form-control-sm">
										<option>Option one</option>
										<option>Option two</option>
										<option>Option three</option>
										<option>Option four</option>
									</select>
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Alamat</label>
									<input type="text" class="form-control boxed form-control-sm">
								</div>
								<div class="form-group">
									<label class="control-label">Jenis Pasien</label>
									<select class="form-control boxed form-control-sm">
										<option>Option one</option>
										<option>Option two</option>
										<option>Option three</option>
										<option>Option four</option>
									</select>
								</div>
								<div class="form-group">
									<label class="control-label">Dokter</label>
									<select class="form-control boxed form-control-sm">
										<option>Option one</option>
										<option>Option two</option>
										<option>Option three</option>
										<option>Option four</option>
									</select>
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Detail Penjualan</label>
									<div class="input-group">
										<input type="text" class="form-control boxed form-control-sm">
									</div>
								</div>
							</div>
							<div class="col-6">
								<div class="form-group">
									<label class="control-label">Keterangan</label>
									<textarea rows="4" class="form-control boxed"></textarea>
								</div>
								<label for="exampleInputEmail1">Discount<span style="color:red">*</span></label>
								<div class="input-group input-group-sm">
									<input type="number" class="boxed form-control">
									<span class="input-group-addon">%</span>
								</div>

								<label for="exampleInputEmail1">Total<span style="color:red">*</span></label>
								<div class="input-group input-group-sm">
									<span class="input-group-addon">Rp</span>
									<input type="number" class="form-control">
									<span class="input-group-addon">,00</span>
								</div>
								<div class="form-group">
									<label class="control-label">Kasir</label>
									<select class="form-control boxed form-control-sm">
											<option>Pilih..</option>
											<option>Amir</option>
											<option>Budi</option>
											<option>Ani</option>
											<option>Mei</option>
											<option>Ayu</option>
											<option>Achmad</option>
										</select>
								</div>
								
							</div>
						</div>
						<div class="col col-12" style="padding:0">
							<div class="container">
								<div class="card card-success">
									<div class="card-header" style="min-height:0">
										<div class="header-block" style="padding: 5px 20px">
											<p class="title"> Barang </p>
										</div>
									</div>
									<div class="card-block" style="background-color: #f4f4f4">
										<button type="button" class="btn btn-sm btn-success">
											<span class="fa fa-plus"></span>&nbsp;Tambah
										</button>			
										<div class="table-responsive">
											<table class="table table-striped table-bordered table-hover">
												<thead>
													<tr>
														<th>Barang</th>
														<th>Satuan</th>
														<th>Tgl. Kadaluarsa</th>
														<th>Jumlah</th>
														<th>Stok</th>
														<th>Harga</th>
														<th>Total</th>
													</tr>
												</thead>
												<tbody>
													<tr>
														<td>Barang A</td>
														<td>Pcs</td>
														<td>31/05/2019</td>
														<td>5</td>
														<td>40</td>
														<td>5000</td>
														<td>25000</td>
													</tr>
													<tr>
														<td>Obat B</td>
														<td>Tablet</td>
														<td>24/08/2019</td>
														<td>10</td>
														<td>100</td>
														<td>250</td>
														<td>2500</td>
													</tr>
													<tr>
														<td>Alkes A</td>
														<td>Buah</td>
														<td>19/11/2030</td>
														<td>5</td>
														<td>50</td>
														<td>1000</td>
														<td>5000</td>
													</tr>
													<tr>
														<td colspan="6" style="text-align: right;"><b>Total : </b></td>
														<td><b>999.999</b></td>
													</tr>
												</tbody>
											</table>
										</div>
									</div>
								</div>
							</div>
						</div>						
					</div>
				</section>
			</article>
			<footer class="footer">

			</footer>
		</div>
	</div>
	<!-- Reference block for JS -->
	<div class="ref" id="ref">
		<div class="color-primary"></div>
		<div class="chart">
			<div class="color-primary"></div>
			<div class="color-secondary"></div>
		</div>
	</div>
	<!-- /.modal -->
	<div class="modal fade" id="confirm-modal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">
						<i class="fa fa-warning"></i> Alert</h4>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
				</div>
				<div class="modal-body">
					<p>Are you sure want to do this?</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-dismiss="modal">Yes</button>
					<button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	<script>
		(function(i, s, o, g, r, a, m)
					{
						i['GoogleAnalyticsObject'] = r;
						i[r] = i[r] || function()
						{
							(i[r].q = i[r].q || []).push(arguments)
						}, i[r].l = 1 * new Date();
						a = s.createElement(o),
							m = s.getElementsByTagName(o)[0];
						a.async = 1;
						a.src = g;
						m.parentNode.insertBefore(a, m)
					})(window, document, 'script', 'https://www.google-analytics.com/analytics.js', 'ga');
					ga('create', 'UA-80463319-4', 'auto');
					ga('send', 'pageview');
	</script>
	<script src="<c:url value="/resources/js/vendor.js "/>"></script>
	<script src="<c:url value="/resources/js/app.js "/>"></script>

</body>

</html>