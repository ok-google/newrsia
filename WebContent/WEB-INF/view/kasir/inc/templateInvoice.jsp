<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>A simple, clean, and responsive HTML invoice template</title>
    
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
    
    .invoice-box table tr td:nth-child(2) {
        text-align: right;
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
    
    .invoice-box table tr.total td:nth-child(2) {
        border-top: 2px solid #eee;
        font-weight: bold;
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
                                Invoice #: 123<br>
                                Created: January 1, 2015<br>
                                Due: February 1, 2015
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            
            <tr class="information">
                <td colspan="2">
                    <table>
                        <tr>
                            <td>
                                Sparksuite, Inc.<br>
                                12345 Sunny Road<br>
                                Sunnyville, CA 12345
                            </td>
                            
                            <td>
                                ${daftar.pendaftaranNo}
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            
            <tr class="heading">
                <table>
                    <thead>
                        <tr>
                            <th>Keterangan</th>
                            <th>Jumlah</th>
                            <th>Biaya</th>
                            <th>Cover</th>
                            <th>Subtotal</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:set var = "totalTindakan" value = "${0}"/>
                        <c:forEach var="tp" items="${daftar.tindakanpasien}" varStatus="loop">
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
                        <c:forEach var="pnj" items="${daftar.penunjangtrans}" varStatus="loop">
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
                        <c:forEach var="trp" items="${daftar.terapi}" varStatus="loop">
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
                        <tr>
                            <td colspan="4" align="right">Total Tagihan</td>
                            <td>${totalTindakan+totalPenunjang+totalTerapi}</td>
                        </tr>
                        <tr>
                            <td colspan="4" align="right">Uang Bayar</td>
                            <td>-</td>
                        </tr>
                        <tr>
                            <td colspan="4" align="right">Uang Kembali</td>
                            <td>-</td>
                        </tr>
                    </tfoot>
                </table>
            </tr>
        </table>
    </div>
</body>
</html>