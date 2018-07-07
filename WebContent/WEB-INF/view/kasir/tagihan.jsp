<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>    

<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>RSIA - Kasir Tagihan</title>
    
    <style>
    .invoice-box {
        max-width: 800px;
        margin: auto;
        padding: 30px;
        border: 1px solid #eee;
        box-shadow: 0 0 10px rgba(0, 0, 0, .15);
        font-size: 16px;
        line-height: 24px;
        font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif;
        color: #555;
        margin-top: 50px;
        font-style: italic;
    }
    
    .invoice-box table {
        width: 100%;
        line-height: inherit;
        text-align: left;
    }
    
    .invoice-box table td {
        padding: 5px;
        vertical-align: top;
    }
    
    .invoice-box table tr.top table td {
        padding-bottom: 20px;
    }
    
    .invoice-box table tr.top table td.title {
        font-size: 45px;
        line-height: 45px;
        color: #333;
    }
    
    .invoice-box table tr.information table td {
        padding-bottom: 40px;
    }
    
    .invoice-box table tr.heading td {
        background: #eee;
        border-bottom: 1px solid #ddd;
        font-weight: bold;
    }
    
    .invoice-box table tr.details td {
        padding-bottom: 20px;
    }
    
    .invoice-box table tr.item td{
        border-bottom: 1px solid #eee;
    }
    
    .invoice-box table tr.item.last td {
        border-bottom: none;
    }
    
    @media only screen and (max-width: 600px) {
        .invoice-box table tr.top table td {
            width: 100%;
            display: block;
            text-align: center;
        }
        
        .invoice-box table tr.information table td {
            width: 100%;
            display: block;
            text-align: center;
        }
    }
    
    /** RTL **/
    .rtl {
        direction: rtl;
        font-family: Tahoma, 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif;
    }
    
    .rtl table {
        text-align: right;
    }
    
    .rtl table tr td:nth-child(2) {
        text-align: left;
    }
    </style>
</head>

<body>
    <div class="invoice-box">
        <table cellpadding="0" cellspacing="0">
            <tr class="top">
                <td colspan="2">
                    <table>
                        <tr>
                            <td class="title">
                                <img src="https://www.sparksuite.com/images/logo.png" style="width:100%; max-width:300px;">
                            </td>
                            
                            <td>
                                <fmt:formatDate value="${now}" pattern="dd MMMM yyyy"/><br/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            
            <tr>
                <table style="border-top: 1px solid red;padding-top: 15px;padding-bottom: 15px;border-bottom: 1px solid red;margin-bottom: 15px;background-color: antiquewhite;">
                    <tbody>
                        <tr>
                            <td style="font-weight: bold;">No. RM </td>
                            <td>:</td>
                            <td style="font-weight: bold;">${transaksiModel.pendaftaran.pasien.pasienNorm}</td>
                        </tr>
                        <tr>
                            <td>Nama</td>
                            <td>:</td>
                            <td>${transaksiModel.pendaftaran.pasien.pasienNama}</td>
                        </tr>
                        <tr>
                            <td>Alamat</td>
                            <td>:</td>
                            <td>${transaksiModel.pendaftaran.pasien.pasienAlamat}</td>
                        </tr>
                        <tr>
                            <td>Jns. Kelamin</td>
                            <td>:</td>
                            <td>${transaksiModel.pendaftaran.pasien.pasienKelamin}</td>
                        </tr>
                        <tr>
                            <td>Tanggal Lahir</td>
                            <td>:</td>
                            <td><fmt:formatDate value="${transaksiModel.pendaftaran.pasien.pasienTanggallahir}" pattern="dd MMMM yyyy" /></td>
                        </tr>
                        <tr>
                            <td>Kelas</td>
                            <td>:</td>
                            <td>${transaksiModel.pendaftaran.kelas.kelasNama}</td>
                        </tr>
                        <tr>
                            <td>Dokter</td>
                            <td>:</td>
                            <td>${transaksiModel.pendaftaran.pegawai.pegawaiNama}</td>
                        </tr>
                        <tr>
                            <td>Tanggal Masuk</td>
                            <td>:</td>
                            <td><fmt:formatDate value="${transaksiModel.pendaftaran.pendaftaranMrs}" pattern="EEEE, dd MMMM yyyy" /></td>
                        </tr>
                        <tr>
                            <td>Tanggal Keluar</td>
                            <td>:</td>
                            <td><fmt:formatDate value="${transaksiModel.pendaftaran.pendaftaranKrs}" pattern="EEEE, dd MMMM yyyy" /></td>
                        </tr>
                    </tbody>
                </table>
            </tr>
            
            <tr class="heading">
                <table>
                    <thead>
                        <tr style="background-color: #ddd;">
                            <th>Keterangan</th>
                            <th>Jumlah</th>
                            <th>Biaya</th>
                            <th>Cover</th>
                            <th>Subtotal</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:set var = "totalKamar" value = "${0}"/>
                        <c:if test="${daftar.kamar != null}">
                            <c:set var = "qtySewa" value = "${rentangHari+1}"/>
                            <c:set var = "totalKamar" value = "${daftar.kamar.tarif * qtySewa}"/>
                            <tr>
                                <td>${daftar.kamar.kamarNo}</td>
                                <td>${qtySewa}</td>
                                <td><fmt:formatNumber value = "${daftar.kamar.tarif}" maxFractionDigits = "3"/></td>
                                <td>0</td>
                                <td><fmt:formatNumber value = "${totalKamar}" maxFractionDigits = "3"/></td>
                            </tr>
                        </c:if>
                        <c:set var = "totalTindakan" value = "${0}"/>
                        <c:forEach var="tp" items="${transaksiModel.pendaftaran.tindakanpasien}" varStatus="loop">
                            <c:set var = "subTindakan" value = "${tp.tindakanpasienHarga}"/>
                            <c:set var = "totalTindakan" value = "${totalTindakan + subTindakan}"/>
                            <tr>
                                <td>${tp.tindakan.tindakanNama}</td>
                                <td>1</td>
                                <td><fmt:formatNumber value = "${tp.tindakanpasienHarga}" maxFractionDigits = "3"/></td>
                                <td>0</td>
                                <td class="kasir-sub-total"><fmt:formatNumber value = "${subTindakan}" maxFractionDigits = "3"/></td>
                            </tr>
                        </c:forEach>

                        <c:set var = "totalPenunjang" value = "${0}"/>
                        <c:forEach var="pnj" items="${transaksiModel.pendaftaran.penunjangtrans}" varStatus="loop">
                            <c:set var = "subPenunjang" value = "${pnj.penunjangtransHarga * pnj.penunjangtransJumlah}"/>
                            <c:set var = "totalPenunjang" value = "${totalPenunjang + subPenunjang}"/>
                            <tr>
                                <td>${pnj.penunjang.penunjangmedisNama}</td>
                                <td>${pnj.penunjangtransJumlah}</td>
                                <td><fmt:formatNumber value = "${pnj.penunjangtransHarga}" maxFractionDigits = "3"/></td>
                                <td>0</td>
                                <td class="kasir-sub-total"><fmt:formatNumber value = "${subPenunjang}" maxFractionDigits = "3"/></td>
                            </tr>
                        </c:forEach>

                        <c:set var = "totalTerapi" value = "${0}"/>
                        <c:forEach var="trp" items="${transaksiModel.pendaftaran.terapi}" varStatus="loop">
                            <c:set var = "subTerapi" value = "${trp.terapiJumlah * trp.terapiHarga}"/>
                            <c:set var = "totalTerapi" value = "${totalTerapi + subTerapi}"/>
                            <tr>
                                <td><% /**${trp.barang.NamaBarang} **/ %></td>
                                <td>${trp.terapiJumlah}</td>
                                <td><fmt:formatNumber value = "${trp.terapiHarga}" maxFractionDigits = "3"/></td>
                                <td>0</td>
                                <td class="kasir-sub-total"><fmt:formatNumber value = "${subTerapi}" maxFractionDigits = "3"/></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                    <tfoot>
                        <tr style="background-color: #ddd; font-weight: bold;">
                            <td colspan="4" align="right">Total Tagihan</td>
                            <td><fmt:formatNumber value = "${totalTindakan+totalPenunjang+totalTerapi}" maxFractionDigits = "3"/></td>
                        </tr>
                    </tfoot>
                </table>
            </tr>
        </table>
    </div>
</body>
</html>