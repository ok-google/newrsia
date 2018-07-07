<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="req" value="${pageContext.request}" />
<c:set var="url">${req.requestURL}</c:set>
<c:set var="uri" value="${req.requestURI}" />
<c:set var="baseURL" value="${fn:substring(url, 0, fn:length(url) - fn:length(uri))}${req.contextPath}/" />

<!DOCTYPE html>
<html>
<head>
	<title>RSI AL-HIKMAH</title>
	<link rel="stylesheet" type="text/css" href="<c:url value='${baseURL}resources/css/app.css'/>" />
	<link rel="stylesheet" type="text/css" href="<c:url value='${baseURL}resources/css/vendor.css'/>" />
	<link rel="stylesheet" type="text/css" href="<c:url value='${baseURL}resources/css/gh-pages.css'/>" />
	<link rel="stylesheet" type="text/css" href="<c:url value='${baseURL}resources/css/style.css'/>" />
	<link rel="stylesheet" type="text/css" href="<c:url value='${baseURL}resources/bootstrap-datepicker/css/bootstrap-datepicker.min.css'/>" />
	<link rel="stylesheet" type="text/css" href="<c:url value='${baseURL}resources/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css'/>" />
	<link rel="stylesheet" type="text/css" href="<c:url value='${baseURL}resources/css/select2.min.css'/>" />
	<script type="text/javascript">
		var BASE_URL = "${baseURL}";
	</script>
</head>
<body>
	<div class="main-wrapper">
		<div class="app" id="app">
			<header class="header">
				<div class="nav-title">
					<c:choose>
						<c:when test="${pagetitle == null}">
							<h3 class="title">Dashboard</h3>
						</c:when>
						<c:otherwise>
							<h3 class="title">${pagetitle}</h3>
						</c:otherwise>
					</c:choose>
				</div>
				<div class="header-block header-block-collapse d-lg-none d-xl-none">
					<button class="collapse-btn" id="sidebar-collapse-btn">
						<i class="fa fa-bars"></i>
					</button>
				</div>
				<div class="header-block header-block-nav"></div>
			</header>
			<aside class="sidebar">
				<div class="sidebar-container">
					<div class="sidebar-header">
						<div class="brand">
							<img style="width: 50px; margin-right: 5px;" src="/resources/images/RSIA.png" />
							<span>RSI AL-HIKMAH</span>
						</div>
					</div>
					<nav class="menu">
						<ul class="sidebar-menu metismenu" id="sidebar-menu">
							<li><a href="/"><i class="fa fa-home"></i> Dashboard </a></li>
							<li>
								<a href="">
									<i class="fa fa-desktop"></i> Farmasi <i class="fa arrow"></i>
								</a>
								<ul class="sidebar-nav">
									<li>
		                                <a href=""> Menu Master <i class="fa arrow"></i> </a>
										<ul class="sidebar-nav collapse" aria-expanded="false">
											<li><a href="/barang/form-add"> Master Barang</a></li>
											<li><a href="/satuan"> Master Satuan</a></li>
											<li><a href="/perusahaan/list/?page=1&limit=10"> Master Perusahaan</a></li>
										</ul>
									</li>
										<li>
			                                <a href=""> Transaksi <i class="fa arrow"></i> </a>
											<ul class="sidebar-nav collapse" aria-expanded="false">
											<li><a href="/order/form-add"> order barang </a></li>
											<li><a href="/terima"> penerimaan barang </a></li>
											<li><a href="/retur-beli/form-add"> retur penerimaan  </a></li>
											<li><a href="/jual/tambah"> penjualan </a></li>
											<li><a href="/retur-jual"> retur penjualan </a></li>
											<li><a href="/opnamet"> stock opname </a></li>
											<li><a href="/stok-obat"> stok barang </a></li>
											<li><a href="/laporan"> laporan expired </a></li>
											<li><a href="/kartu-stok"> kartu stok	</a></li>
										</ul>
									</li>
								</ul>
							</li>
							<li>
								<a href="">
									<i class="fa fa-desktop"></i> Rekam Medis <i class="fa arrow"></i>
								</a>
								<ul class="sidebar-nav">
									<li>
		                                <a href=""> Menu Master <i class="fa arrow"></i> </a>
										<ul class="sidebar-nav collapse" aria-expanded="false">
											<li><a href="/kamar">Master Kamar</a>
											<li><a href="/kelas">Master Kelas</a>
											<li><a href="/kondisi">Master Kondisi Pasien</a>
											<li><a href="/paket">Master Paket</a>
											<li><a href="/pasien">Master Pasien</a>
											<li><a href="/penunjang">Master Penunjang</a>
											<li><a href="/penunjang-group">Master Penunjang Group</a>
											<li><a href="/ruangan">Master Ruangan</a>
											<li><a href="/tindakan">Master Tindakan</a>
											<li><a href="/rujukan">Master Rujukan</a>
										</ul>
									</li>
									<li>
		                                <a href=""> Transaksi <i class="fa arrow"></i> </a>
										<ul class="sidebar-nav collapse" aria-expanded="false">
											<li><a href="/pendaftaran"> Pendaftaran</a></li>
											<li><a href="/pelayanan"> Pelayanan</a></li>
											<li><a href="/kasir"> Kasir</a></li>
											<li><a href="/history"> History pasien</a></li>
										</ul>
									</li>
								</ul>
							</li>
							<li>
								<a href="">
									<i class="fa fa-desktop"></i> Penggajian <i class="fa arrow"></i>
								</a>
								<ul class="sidebar-nav">
									<li><a href="/pegawai">Master Pegawai</a>
									<li><a href="/gaji">Penggajian</a>
								</ul>
							</li>
							<li>
								<a href="">
									<i class="fa fa-desktop"></i> Master Pelengkap <i class="fa arrow"></i>
								</a>
								<ul class="sidebar-nav">
									<li><a href="/agama">Master Agama</a>
									<li>
		                                <a href=""> Master Wilayah <i class="fa arrow"></i> </a>
										<ul class="sidebar-nav collapse" aria-expanded="false">
		                                    <li>
		                                        <a href="/provinsi/tambah">
		                                         Provinsi
		                                        </a>
		                                    </li>
		                                    <li>
		                                        <a href="/kota/tambah">
		                                         Kota
		                                        </a>
		                                    </li>
		                                    <li>
		                                        <a href="/kecamatan/tambah">
		                                         Kecamatan
		                                        </a>
		                                    </li>
		                                    <li>
		                                        <a href="/kelurahan/tambah">
		                                         Kelurahan
		                                        </a>
		                                    </li>
										</ul>
									</li>
								</ul>
							</li>
							<li>
								<a href="/login?logout"> <i class="fa fa-sign-out"></i> Logout </a>
							</li>
						</ul>
					</nav>
					<footer class="sidebar-footer">
						<ul class="sidebar-menu metismenu" id="customize-menu"></ul>
					</footer>
				</div>
			</aside>
			<div class="sidebar-overlay" id="sidebar-overlay"></div>
			<div class="sidebar-mobile-menu-handle" id="sidebar-mobile-menu-handle"></div>
			<div class="mobile-menu-handle"></div>
			<article class="content forms-page">
			