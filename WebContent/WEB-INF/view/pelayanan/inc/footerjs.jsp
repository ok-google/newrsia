<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script type="text/javascript">
$(document).ready(function(){
    if ($('#select-selesai').val() == 'Y') {
        $('#form-selesai').show();
    } else {
        $('#form-selesai').find('input, select').each(function () {
            $(this).attr('disabled',true);
        });
    }
    $('#select-selesai').change(function () {
        if ($(this).val() == 'Y') {
            $('#form-selesai').find('input, select').each(function () {
                $(this).attr('disabled',false);
            });
            $('#form-selesai').show(500);
        } else {
            $('#form-selesai').find('input, select').each(function () {
                $(this).attr('disabled',true);
            });
            $('#form-selesai').hide(500);
        }
    });
});

</script>

<script type="text/javascript">
    var riwayatperiksa_length = $('#pelayanan-riwayatperiksa-list').find('tr').length;
    var periksapasien_length = $('#pelayanan-periksapasien-list').find('tr').length;
	var tindakan_length = $('#pelayanan-tindakan-list').find('tr').length;
    var diagnosapasien_length = $('#pelayanan-diagnosapasien-list').find('tr').length;
	var diagnosa9_length = $('#pelayanan-diagnosa9-list').find('tr').length;
    var pakai_length = $('#pelayanan-pakai-list').find('tr').length;
    var resep_length = $('#pelayanan-resep-list').find('tr').length;
    var penunjangtrans_length = $('#pelayanan-penunjangtrans-list').find('tr').length;
    var soap_length = $('#pelayanan-soap-list').find('tr').length;

    $(function(){
		$('#simpan-pelayanan').click(function () {
            $('#pelayanan-riwayatperiksa-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','riwayatperiksa[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });

            $('#pelayanan-periksapasien-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','periksapasien[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });

            $('#pelayanan-diagnosapasien-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','diagnosapasien[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });

            // prosedur
            $('#pelayanan-diagnosa9-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','diagnosa9[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });

            
            $('#pelayanan-tindakan-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','tindakanpasien[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });

            $('#pelayanan-pakai-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','pakai[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });
            $('#pelayanan-resep-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','resep[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });
            $('#pelayanan-penunjangtrans-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','penunjangtrans[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });
            $('#pelayanan-soap-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','soap[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });
			$('#pelayanan-form').submit();
		});

        $('#add_riwayatperiksa').click(function(){
            $('#form-pelayanan-riwayatperiksa').find('input,select').val('');
            $('#riwayatperiksa_mode').val('new');
            $('#modal-pelayanan-riwayatperiksa').modal('show');
        });
        $('#add_periksapasien').click(function(){
            $('#form-pelayanan-periksapasien').find('input,select').val('');
            $('#periksapasien_mode').val('new');
            $('#modal-pelayanan-periksapasien').modal('show');
        });
        $('#add_diagnosapasien').click(function(){
            $('#form-pelayanan-diagnosapasien').find('input,select').val('');
            $('#diagnosapasien_mode').val('new');
            $('#modal-pelayanan-diagnosapasien').modal('show');
        });

        //prosedur
        $('#add_diagnosa9').click(function(){
            $('#form-pelayanan-diagnosa9').find('input,select').val('');
            $('#diagnosa9_mode').val('new');
            $('#modal-pelayanan-diagnosa9').modal('show');
        });
           
        $('#add_tindakan').click(function(){
            $('#form-pelayanan-tindakan').find('input,select').val('');
            $('#tindakan_mode').val('new');
            $('#modal-pelayanan-tindakan').modal('show');
        });
        
        $('#add_pakai').click(function(){
            $('#form-pelayanan-pakai').find('input,select').val('');
            $('#pakai_mode').val('new');
            $('#modal-pelayanan-pakai').modal('show');
        });
        $('#add_resep').click(function(){
            $('#form-pelayanan-resep').find('input,select').val('');
            $('#resep_mode').val('new');
            $('#modal-pelayanan-resep').modal('show');
        });
        $('#add_penunjangtrans').click(function(){
            $('#form-pelayanan-penunjangtrans').find('input,select').val('');
            $('#penunjangtrans_mode').val('new');
            $('#modal-pelayanan-penunjangtrans').modal('show');
        });
        $('#add_soap').click(function(){
            $('#form-pelayanan-soap').find('input,select').val('');
            $('#soap_mode').val('new');
            $('#modal-pelayanan-soap').modal('show');
        });

        $('#simpan-riwayatperiksa').click(function(){
            var mode,counter,id_row;
            var mode = $('#riwayatperiksa_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = riwayatperiksa_length+1;
                tr.attr('id','riwayatperiksa_'+counter);
            }
            else
            {
                id_row = $('#riwayatperiksa_edit').val();
                counter = id_row;
                var tr = $('#riwayatperiksa_'+id_row);
                tr.empty();
            }

            periksaID = $('#periksaID').val();
            periksaTanggal = $('#periksaTanggal').val() ||0;
            periksaTb = $('#periksaTb').val() ||0;
            periksaBb = $('#periksaBb').val() ||0;
            periksaJantung = $('#periksaJantung').val() ||0;
            periksaTensi = $('#periksaTensi').val() ||0;
            periksaSuhu = $('#periksaSuhu').val() ||0;
            periksaNafas = $('#periksaNafas').val() ||0;
            periksaKeluhan = $('#periksaKeluhan').val() ||'';
            pegawai = $('#pegawai').val();
            pegawaiText = $('#pegawai option:selected').text();
            periksaPemeriksa = $('#periksaPemeriksa').val() ||'';
            tr.append('<td data-used="1" data-save="1" data-name="periksaTanggal" data-kolom-id="periksaTanggal">'+periksaTanggal+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksaTb" data-kolom-id="periksaTb">'+periksaTb+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksaBb" data-kolom-id="periksaBb">'+periksaBb+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksaJantung" data-kolom-id="periksaJantung">'+periksaJantung+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksaTensi" data-kolom-id="periksaTensi">'+periksaTensi+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksaSuhu" data-kolom-id="periksaSuhu">'+periksaSuhu+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksaNafas" data-kolom-id="periksaNafas">'+periksaNafas+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksaKeluhan" data-kolom-id="periksaKeluhan">'+periksaKeluhan+'</td>');
            tr.append('<td>'+pegawaiText+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteRiwayatperiksa('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editRiwayatperiksa('+counter+')">Edit</button></td>');
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="pegawai.pegawaiID" data-kolom-id="pegawai">' + pegawai + '</td>');
            if (periksaID) {
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="periksaID" data-kolom-id="periksaID">' + periksaID + '</td>');
            }

            if(mode == 'new')
            {
                riwayatperiksa_length = counter;
                $('#pelayanan-riwayatperiksa-list').append(tr);                    
            }

            $('#modal-pelayanan-riwayatperiksa').modal('hide');
            $('#form-pelayanan-riwayatperiksa').find('input,select').val('');

        });
         $('#simpan-periksapasien').click(function(){
            var periksapasienID,periksapasienTinggi,mode,counter,id_row;
            var mode = $('#periksapasien_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = periksapasien_length+1;
                tr.attr('id','periksapasien_'+counter);
            }
            else
            {
                id_row = $('#periksapasien_edit').val();
                counter = id_row;
                var tr = $('#periksapasien_'+id_row);
                tr.empty();
            }

            periksapasienID = $('#periksapasienID').val();
            periksapasienTanggal = $('#periksapasienTanggal').val() ||0;
            periksapasienPeriksaID = $('#periksapasienPeriksaID').val();
            periksapasienPeriksaNama = $('#periksapasienPeriksaID option:selected').text();
            periksapasienPeriksaStandar = $('#periksapasienPeriksaStandar').val() ||0;
            periksapasienPeriksaNilai = $('#periksapasienPeriksaNilai').val() ||0;
            periksaPegawaiID = $('#periksaPegawaiID').val();
            pegawaiNama = $('#periksaPegawaiID option:selected').text();
            periksapasienPeriksaKeterangan = $('#periksapasienPeriksaKeterangan').val() || '';
            
            tr.append('<td data-used="1" data-save="1" data-name="periksapasienTanggal" data-kolom-id="periksapasienTanggal">'+periksapasienTanggal+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksapasienPeriksaNama" data-kolom-id="periksapasienPeriksaNama">'+periksapasienPeriksaNama+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksapasienPeriksaStandar" data-kolom-id="periksapasienPeriksaStandar">'+periksapasienPeriksaStandar+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksapasienPeriksaNilai" data-kolom-id="periksapasienPeriksaNilai">'+periksapasienPeriksaNilai+'</td>');
            tr.append('<td>'+ pegawaiNama +'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksapasienPeriksaKeterangan" data-kolom-id="periksapasienPeriksaKeterangan">'+periksapasienPeriksaKeterangan+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deletePeriksapasien('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editPeriksapasien('+counter+')">Edit</button></td>');
            tr.append('<td style="display:none" data-used="1" data-save="1" data-name="periksapasienPeriksaID" data-kolom-id="periksapasienPeriksaID">' + periksapasienPeriksaID + '</td>');
            tr.append('<td style="display:none" data-used="1" data-save="1" data-name="pegawai.pegawaiID" data-kolom-id="periksaPegawaiID">' + periksaPegawaiID + '</td>');

            if (periksapasienID) {
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="periksapasienID" data-kolom-id="periksapasienID">' + periksapasienID + '</td>');
            }

            if(mode == 'new')
            {
                periksapasien_length = counter;
                $('#pelayanan-periksapasien-list').append(tr);                    
            }

            $('#modal-pelayanan-periksapasien').modal('hide');
            $('#form-pelayanan-periksapasien').find('input,select').val('');

        }); 
        
        $('#simpan-diagnosapasien').click(function(){
            var diagnosapasienID,diagnosapasien_tinggi,mode,counter,id_row;
            var mode = $('#diagnosapasien_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = diagnosapasien_length+1;
                tr.attr('id','diagnosapasien_'+counter);
            }
            else
            {
                id_row = $('#diagnosapasien_edit').val();
                counter = id_row;
                var tr = $('#diagnosapasien_'+id_row);
                tr.empty();
            }

            diagnosapasienID = $('#diagnosapasienID').val();
            // icd = $('#icd').val() ||0;
            // icdText = $('#icd option:selected').text();
            diagnosapasienNamaDiagnosa = $('#diagnosapasienNamaDiagnosa').val();
            diagnosapasienJenis = $('#diagnosapasienJenis').val();
            diagnosapasienJenisText = $('#diagnosapasienJenis option:selected').text();
            diagnosapasienKasus = $('#diagnosapasienKasus').val();
            diagnosapasienKasusText = $('#diagnosapasienKasus option:selected').text();
            diagnosapasienKeterangan = $('#diagnosapasienKeterangan').val() || '';
            diagnosapasienTanggal = $('#diagnosapasienTanggal').val() ||0;

            tr.append('<td data-used="1" data-save="1" data-name="diagnosapasienTanggal" data-kolom-id="diagnosapasienTanggal">'+diagnosapasienTanggal+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="diagnosapasienNamaDiagnosa" data-kolom-id="diagnosapasienNamaDiagnosa">'+diagnosapasienNamaDiagnosa+'</td>');
            tr.append('<td>'+diagnosapasienJenisText+'</td>');
            tr.append('<td>'+diagnosapasienKasusText+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="diagnosapasienKeterangan" data-kolom-id="diagnosapasienKeterangan">'+diagnosapasienKeterangan+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteDiagnosapasien('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editDiagnosapasien('+counter+')">Edit</button></td>');
            // tr.append('<td style="display:none" data-used="1" data-save="1" data-name="icd.icdID" data-kolom-id="icd">' + icd + '</td>');
            tr.append('<td style="display:none" data-used="1" data-save="1" data-name="diagnosapasienJenis" data-kolom-id="diagnosapasienJenis">' + diagnosapasienJenis + '</td>');
            tr.append('<td style="display:none" data-used="1" data-save="1" data-name="diagnosapasienKasus" data-kolom-id="diagnosapasienKasus">' + diagnosapasienKasus + '</td>');

            if (diagnosapasienID) {
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="diagnosapasienID" data-kolom-id="diagnosapasienID">' + diagnosapasienID + '</td>');
            }

            if(mode == 'new')
            {
                diagnosapasien_length = counter;
                $('#pelayanan-diagnosapasien-list').append(tr);                    
            }

            $('#modal-pelayanan-diagnosapasien').modal('hide');
            $('#form-pelayanan-diagnosapasien').find('input,select').val('');

        }); 

        //prosedur
        $('#simpan-diagnosa9').click(function(){
            var diagnosa9ID,diagnosa9_tinggi,mode,counter,id_row;
            var mode = $('#diagnosa9_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = diagnosa9_length+1;
                tr.attr('id','diagnosa9_'+counter);
            }
            else
            {
                id_row = $('#diagnosa9_edit').val();
                counter = id_row;
                var tr = $('#diagnosa9_'+id_row);
                tr.empty();
            }

            diagnosa9ID = $('#diagnosa9ID').val();
            icd9 = $('#icd9').val() ||0;
            diagnosa9Tanggal = $('#diagnosa9Tanggal').val() ||0;
            diagnosa9Icd9Text = $('#icd9 option:selected').text() || '';
            diagnosa9Icd9Kode = $('#icd9 option:selected').attr('date-kode') || '';
            diagnosa9Nama = $('#diagnosa9Nama').val() ||0;
            diagnosa9Keterangan = $('#diagnosa9Keterangan').val() ||0;

            tr.append('<td data-used="1" data-save="1" data-name="diagnosa9Tanggal" data-kolom-id="diagnosa9Tanggal">'+diagnosa9Tanggal+'</td>');
            tr.append('<td>' + diagnosa9Icd9Kode + '</td>');
            tr.append('<td>' + diagnosa9Icd9Text + '</td>');
            tr.append('<td data-used="1" data-save="1" data-name="diagnosa9Keterangan" data-kolom-id="diagnosa9Keterangan">'+diagnosa9Keterangan+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteDiagnosa9('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editDiagnosa9('+counter+')">Edit</button></td>');
            tr.append('<td style="display:none" data-used="1" data-save="1" data-name="icd9.icd9ID" data-kolom-id="icd9">' + icd9 + '</td>');

            if (diagnosa9ID) {
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="diagnosa9ID" data-kolom-id="diagnosa9ID">' + diagnosa9ID + '</td>');
            }

            if(mode == 'new')
            {
                diagnosa9_length = counter;
                $('#pelayanan-diagnosa9-list').append(tr);                    
            }

            $('#modal-pelayanan-diagnosa9').modal('hide');
            $('#form-pelayanan-diagnosa9').find('input,select').val('');

        }); 

        $('#simpan-tindakan').click(function(){
            var tindakanpasienHarga,mode,counter,id_row;
            var mode = $('#tindakan_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = tindakan_length+1;
                tr.attr('id','tindakan_'+counter);
            }
            else
            {
                id_row = $('#tindakan_edit').val();
                counter = id_row;
                var tr = $('#tindakan_'+id_row);
                tr.empty();
            }

            tindakanpasienID = $('#tindakanpasienID').val();
            tindakanID = $('#tindakanID').val();
            tindakanText = $('#tindakanID option:selected').text();
            tindakanPegawaiID = $('#tindakanPegawaiID').val();
            pegawaiText = $('#tindakanPegawaiID option:selected').text();
        	tindakanpasienHarga = $('#tindakanpasienHarga').val() ||0;

            tr.append('<td>'+tindakanText+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="tindakanpasienHarga" data-kolom-id="tindakanpasienHarga">'+tindakanpasienHarga+'</td>');
            tr.append('<td>'+pegawaiText+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteTindakan('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editTindakan('+counter+')">Edit</button></td>');
            tr.append('<td style="display:none" data-used="1" data-save="1" data-name="tindakan.tindakanID" data-kolom-id="tindakanID">'+tindakanID+'</td>');
            tr.append('<td style="display:none" data-used="1" data-save="1" data-name="pegawai.pegawaiID" data-kolom-id="tindakanPegawaiID">'+tindakanPegawaiID+'</td>');
            if (tindakanpasienID) {
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="tindakanpasienID" data-kolom-id="tindakanpasienID">' + tindakanpasienID + '</td>');
            }

            if(mode == 'new')
            {
                tindakan_length = counter;
                $('#pelayanan-tindakan-list').append(tr);                    
            }

            $('#modal-pelayanan-tindakan').modal('hide');
            $('#form-pelayanan-tindakan').find('input,select').val('');

        }); 

        $('#simpan-pakai').click(function(){
            var pakai_tinggi,mode,counter,id_row;
            var mode = $('#pakai_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = pakai_length+1;
                tr.attr('id','pakai_'+counter);
            }
            else
            {
                id_row = $('#pakai_edit').val();
                counter = id_row;
                var tr = $('#pakai_'+id_row);
                tr.empty();
            }

            pakaiID = $('#pakaiID').val();
            pakaiBarang = $('#pakaiBarang').val() ||0;
            pakaiSatuan = $('#pakaiSatuan').val() ||0;
            pakaiJumlah = $('#pakaiJumlah').val() ||0;
            pakaiHarga = $('#pakaiHarga').val() ||0;
            pakaiSubtotal = $('#pakaiSubtotal').val() ||0;
            pakaiKeterangan = $('#pakaiKeterangan').val() ||0;
            
            tr.append('<td data-used="1" data-save="1" data-name="pakaiBarang" data-kolom-id="pakaiBarang">'+pakaiBarang+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="pakaiSatuan" data-kolom-id="pakaiSatuan">'+pakaiSatuan+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="pakaiJumlah" data-kolom-id="pakaiJumlah">'+pakaiJumlah+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="pakaiHarga" data-kolom-id="pakaiHarga">'+pakaiHarga+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="pakaiSubtotal" data-kolom-id="pakaiSubtotal">'+pakaiSubtotal+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="pakaiKeterangan" data-kolom-id="pakaiKeterangan">'+pakaiKeterangan+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deletePakai('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editPakai('+counter+')">Edit</button></td>');

            if (pakaiID) {
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="pakaiID" data-kolom-id="pakaiID">' + pakaiID + '</td>');
            }

            if(mode == 'new')
            {
                pakai_length = counter;
                $('#pelayanan-pakai-list').append(tr);                    
            }

            $('#modal-pelayanan-pakai').modal('hide');
            $('#form-pelayanan-pakai').find('input,select').val('');

        }); 

         $('#simpan-resep').click(function(){
            var resep_tinggi,mode,counter,id_row;
            var mode = $('#resep_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = resep_length+1;
                tr.attr('id','resep_'+counter);
            }
            else
            {
                id_row = $('#resep_edit').val();
                counter = id_row;
                var tr = $('#resep_'+id_row);
                tr.empty();
            }

            resepID = $('#resepID').val();
            resepBarang = $('#resepBarang').val() ||0;
            resepBarangText = (resepBarang) ? $('#resepBarang option:selected').text() : '';
            resepSatuan = $('#resepSatuan').val() ||0;
            resepJumlah = $('#resepJumlah').val() ||0;
            resepAturan = $('#resepAturan').val() ||0;
            resepKeterangan = $('#resepKeterangan').val() ||0;
            
            tr.append('<td>'+resepBarangText+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="resepSatuan" data-kolom-id="resepSatuan">'+resepSatuan+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="resepJumlah" data-kolom-id="resepJumlah">'+resepJumlah+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="resepAturan" data-kolom-id="resepAturan">'+resepAturan+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="resepKeterangan" data-kolom-id="resepKeterangan">'+resepKeterangan+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteResep('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editResep('+counter+')">Edit</button></td>');
            tr.append('<td style="display:none" data-used="1" data-save="1" data-name="resepBarang" data-kolom-id="resepBarang">' + resepBarang + '</td>');
            if (resepID) {
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="resepID" data-kolom-id="resepID">' + resepID + '</td>');
            }

            if(mode == 'new')
            {
                resep_length = counter;
                $('#pelayanan-resep-list').append(tr);                    
            }

            $('#modal-pelayanan-resep').modal('hide');
            $('#form-pelayanan-resep').find('input,select').val('');

        }); 


         $('#penunjangMedis').change(function(){
            var pnjSelected = $('#penunjangMedis option:selected')
            $('#penunjangtransStandar').val(pnjSelected.attr('data-standar'));
            $('#penunjangtransSatuan').val(pnjSelected.attr('data-satuan'));
            $('#penunjangtransHarga').val(pnjSelected.attr('data-harga'));
         });

         $('#tindakanID').change(function(){
            var harga = $('option:selected', this).attr('data-harga')
            $('#tindakanpasienHarga').val(harga);
         });

        $('#simpan-penunjangtrans').click(function(){
            var penunjangtrans_tinggi,mode,counter,id_row;
            var mode = $('#penunjangtrans_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = penunjangtrans_length+1;
                tr.attr('id','penunjangtrans_'+counter);
            }
            else
            {
                id_row = $('#penunjangtrans_edit').val();
                counter = id_row;
                var tr = $('#penunjangtrans_'+id_row);
                tr.empty();
            }

            penunjangtransID = $('#penunjangtransID').val() ||0;
            penunjangMedis = $('#penunjangMedis').val();
            penunjangtransNama = $('#penunjangMedis option:selected').text();
            penunjangtransHasil = $('#penunjangtransHasil').val() ||0;
            penunjangtransStandar = $('#penunjangtransStandar').val() ||0;
            penunjangtransSatuan = $('#penunjangtransSatuan').val() ||0;
            penunjangtransJumlah = $('#penunjangtransJumlah').val() ||0;
            penunjangtransHarga = $('#penunjangtransHarga').val() ||0;
            penunjangtransSubtotal = penunjangtransJumlah * penunjangtransHarga

            tr.append('<td>' + penunjangtransNama + '</td>');
            tr.append('<td data-used="1" data-save="1" data-name="penunjangtransHasil" data-kolom-id="penunjangtransHasil">'+penunjangtransHasil+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="penunjangtransStandar" data-kolom-id="penunjangtransStandar">'+penunjangtransStandar+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="penunjangtransSatuan" data-kolom-id="penunjangtransSatuan">'+penunjangtransSatuan+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="penunjangtransJumlah" data-kolom-id="penunjangtransJumlah">'+penunjangtransJumlah+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="penunjangtransHarga" data-kolom-id="penunjangtransHarga">'+penunjangtransHarga+'</td>');
            tr.append('<td>'+penunjangtransSubtotal+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deletePenunjangtrans('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editPenunjangtrans('+counter+')">Edit</button></td>');
            tr.append('<td style="display:none" data-used="1" data-save="1" data-name="penunjang.penunjangmedisID" data-kolom-id="penunjangMedis">' + penunjangMedis + '</td>');
            if (penunjangtransID) {
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="penunjangtransID" data-kolom-id="penunjangtransID">' + penunjangtransID + '</td>');
            }

            if(mode == 'new')
            {
                penunjangtrans_length = counter;
                $('#pelayanan-penunjangtrans-list').append(tr);                    
            }

            $('#modal-pelayanan-penunjangtrans').modal('hide');
            $('#form-pelayanan-penunjangtrans').find('input,select').val('');

        }); 

         $('#simpan-soap').click(function(){
            var soap_tinggi,mode,counter,id_row;
            var mode = $('#soap_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = soap_length+1;
                tr.attr('id','soap_'+counter);
            }
            else
            {
                id_row = $('#soap_edit').val();
                counter = id_row;
                var tr = $('#soap_'+id_row);
                tr.empty();
            }

            soapID = $('#soapID').val() ||0;
            soapTanggal = $('#soapTanggal').val() ||0;
            soapSubject = $('#soapSubject').val() ||0;
            soapObject = $('#soapObject').val() ||0;
            soapAssesment = $('#soapAssesment').val() ||0;
            soapPlan = $('#soapPlan').val() ||0;
            
            tr.append('<td data-used="1" data-save="1" data-name="soapTanggal" data-kolom-id="soapTanggal">'+soapTanggal+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="soapSubject" data-kolom-id="soapSubject">'+soapSubject+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="soapObject" data-kolom-id="soapObject">'+soapObject+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="soapAssesment" data-kolom-id="soapAssesment">'+soapAssesment+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="soapPlan" data-kolom-id="soapPlan">'+soapPlan+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteSoap('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editSoap('+counter+')">Edit</button></td>');
            if (soapID) {
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="soapID" data-kolom-id="soapID">' + soapID + '</td>');
            }

            if(mode == 'new')
            {
                soap_length = counter;
                $('#pelayanan-soap-list').append(tr);                    
            }

            $('#modal-pelayanan-soap').modal('hide');
            $('#form-pelayanan-soap').find('input,select').val('');

        }); 

        // next simpan

    });


    function editRiwayatperiksa(id)
    {
        var tr;
        $('#riwayatperiksa_mode').val('edit');
        $('#riwayatperiksa_edit').val(id);
        tr = $('#riwayatperiksa_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elemID = $(e).attr('data-kolom-id');
                $('#'+elemID).val($(e).text());
            }
        });
        $('#modal-pelayanan-riwayatperiksa').modal('show');
    }

    function deleteRiwayatperiksa(id)
    {
        var tr;
        tr = $('#riwayatperiksa_'+id);
        tr.append('<td style="display:none" data-used="1" data-save="1" data-name="remove" data-kolom-id="remove">1</td>');
        tr.hide();
    }
    
    function editPeriksapasien(id)
    {
        var tr;
        $('#periksapasien_mode').val('edit');
        $('#periksapasien_edit').val(id);
        tr = $('#periksapasien_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elemID = $(e).attr('data-kolom-id');
                $('#'+elemID).val($(e).text());
            }
        });
        $('#modal-pelayanan-periksapasien').modal('show');
    }

    function deletePeriksapasien(id)
    {
        var tr;
        tr = $('#periksapasien_'+id);
        tr.append('<td style="display:none" data-used="1" data-save="1" data-name="remove" data-kolom-id="remove">1</td>');
        tr.hide();
    }  

    function editDiagnosapasien(id)
    {
        var tr;
        $('#diagnosapasien_mode').val('edit');
        $('#diagnosapasien_edit').val(id);
        tr = $('#diagnosapasien_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elemID = $(e).attr('data-kolom-id');
                $('#'+elemID).val($(e).text());
            }
        });
        $('#modal-pelayanan-diagnosapasien').modal('show');
    }

    function deleteDiagnosapasien(id)
    {
        var tr;
        tr = $('#diagnosapasien_'+id);
        tr.append('<td style="display:none" data-used="1" data-save="1" data-name="remove" data-kolom-id="remove">1</td>');
        tr.hide();
    }

    // procedur
    function editDiagnosa9(id)
    {
        var tr;
        $('#diagnosa9_mode').val('edit');
        $('#diagnosa9_edit').val(id);
        tr = $('#diagnosa9_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elemID = $(e).attr('data-kolom-id');
                $('#'+elemID).val($(e).text());
            }
        });
        $('#modal-pelayanan-diagnosa9').modal('show');
    }

    function deleteDiagnosa9(id)
    {
        var tr;
        tr = $('#diagnosa9_'+id);
        tr.append('<td style="display:none" data-used="1" data-save="1" data-name="remove" data-kolom-id="remove">1</td>');
        tr.hide();
    }

    function editTindakan(id)
    {
        var tr;
        $('#tindakan_mode').val('edit');
        $('#tindakan_edit').val(id);
        tr = $('#tindakan_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elemID = $(e).attr('data-kolom-id');
                $('#'+elemID).val($(e).text());
            }
        });
        $('#modal-pelayanan-tindakan').modal('show');
    }

    function deleteTindakan(id)
    {
        var tr;
        tr = $('#tindakan_'+id);
        tr.append('<td style="display:none" data-used="1" data-save="1" data-name="remove" data-kolom-id="remove">1</td>');
        tr.hide();
    }

    function editPakai(id)
    {
        var tr;
        $('#pakai_mode').val('edit');
        $('#pakai_edit').val(id);
        tr = $('#pakai_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elemID = $(e).attr('data-kolom-id');
                $('#'+elemID).val($(e).text());
            }
        });
        $('#modal-pelayanan-pakai').modal('show');
    }

    function deletePakai(id)
    {
        var tr;
        tr = $('#pakai_'+id);
        tr.append('<td style="display:none" data-used="1" data-save="1" data-name="remove" data-kolom-id="remove">1</td>');
        tr.hide();
    }  

    function editResep(id)
    {
        var tr;
        $('#resep_mode').val('edit');
        $('#resep_edit').val(id);
        tr = $('#resep_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elemID = $(e).attr('data-kolom-id');
                $('#'+elemID).val($(e).text());
            }
        });
        $('#modal-pelayanan-resep').modal('show');
    }

    function deleteResep(id)
    {
        var tr;
        tr = $('#resep_'+id);
        tr.append('<td style="display:none" data-used="1" data-save="1" data-name="remove" data-kolom-id="remove">1</td>');
        tr.hide();
    }  

    function editPenunjangtrans(id)
    {
        var tr;
        $('#penunjangtrans_mode').val('edit');
        $('#penunjangtrans_edit').val(id);
        tr = $('#penunjangtrans_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elemID = $(e).attr('data-kolom-id');
                $('#'+elemID).val($(e).text());
            }
        });
        $('#modal-pelayanan-penunjangtrans').modal('show');
    }

    function deletePenunjangtrans(id)
    {
        var tr;
        tr = $('#penunjangtrans_'+id);
        tr.append('<td style="display:none" data-used="1" data-save="1" data-name="remove" data-kolom-id="remove">1</td>');
        tr.hide();
    }  

    function editSoap(id)
    {
        var tr;
        $('#soap_mode').val('edit');
        $('#soap_edit').val(id);
        tr = $('#soap_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elemID = $(e).attr('data-kolom-id');
                $('#'+elemID).val($(e).text());
            }
        });
        $('#modal-pelayanan-soap').modal('show');
    }

    function deleteSoap(id)
    {
        var tr;
        tr = $('#soap_'+id);
        tr.append('<td style="display:none" data-used="1" data-save="1" data-name="remove" data-kolom-id="remove">1</td>');
        tr.hide();
    }  

</script>