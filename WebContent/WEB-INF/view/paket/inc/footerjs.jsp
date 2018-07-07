<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
        var kamar_length = $('#paket-kamar-list').find('tr').length;
        var tindakan_length = $('#paket-tindakan-list').find('tr').length;
        var penunjang_length = $('#paket-penunjang-list').find('tr').length;
        var barang_length = $('#paket-barang-list').find('tr').length;
        $(function(){
            $('#tab_first').click();
            $('#simpan-paket').click(function(){
                $('.table-form tr').map(function(line){
                    $(this).find('td').each(function (i) {
                        if($(this).attr('data-save') == '1')
                        {
                            var name = $(this).attr('data-name');
                            var value = $(this).text();
                            var new_input = $('<input type="hidden">');
                            new_input.attr('name','paketDetail[' + line + '].' + name);
                            new_input.attr('value',value);

                            $('#paket-form').append(new_input);
                        }
                    });
                    var paket_type_name = $(this).attr('data-harga-type');
                    if (paket_type_name) {
                        var paket_type = $('<input type="hidden">');
                        paket_type.attr('name','paketDetail[' + line + '].paketDetailType');
                        paket_type.attr('value', paket_type_name);
                        $('#paket-form').append(paket_type);
                    }
                });

                $('#paket-form').submit();

            });
            $('#add_kamar').click(function(){
                $('#form-paket-kamar').find('input,select').val('');
                $('#kamar_mode').val('new');
                $('#form-paket-kamar').modal('show');
            });
            $('#add_tindakan').click(function(){
                $('#form-paket-tindakan').find('input,select').val('');
                $('#tindakan_mode').val('new');
                $('#form-paket-tindakan').modal('show');
            });
            $('#add_penunjang').click(function(){
                $('#form-paket-penunjang').find('input,select').val('');
                $('#penunjang_mode').val('new');
                $('#form-paket-penunjang').modal('show');
            });
            $('#add_barang').click(function(){
                $('#form-paket-barang').find('input,select').val('');
                $('#barang_mode').val('new');
                $('#form-paket-barang').modal('show');
            });

            $('#kamarID').change(function(){
                var harga = $('option:selected', this).attr('data-harga')
                $('#paketKamarHarga').val(harga);
            });

            $('#simpan-kamar').click(function(){
                var kamarID,paketKamarHarga,kamarText,mode,counter,id_row;
                var mode = $('#kamar_mode').val();

                if(mode == 'new')
                {
                    var tr = $('<tr>');
                    counter = kamar_length+1;
                    tr.attr('id','kamar_'+counter);
                    tr.attr('data-harga-type','kamar');
                }
                else
                {
                    id_row = $('#kamar_edit').val();
                    counter = id_row;
                    var tr = $('#kamar_'+id_row);
                    tr.empty();
                }

                kamarID = $('#kamarID').val();
                kamarText = $('#kamarID option:selected').text();
                paketKamarHarga = $('#paketKamarHarga').val() ||0;
                
                tr.append('<td>'+kamarText+'</td>');
                tr.append('<td class="td-harga" data-used="1" data-save="1" data-name="paketDetailHarga" data-kolom-id="paketKamarHarga">'+paketKamarHarga+'</td>');
                tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteKamar('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editKamar('+counter+')">Edit</button></td>');
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="kamars.kamarID" data-kolom-id="kamarID">'+kamarID+'</td>');
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="paketDetailJumlah" >1</td>');

                if(mode == 'new')
                {
                    kamar_length = counter;
                    $('#paket-kamar-list').append(tr);                    
                }

                $('#form-paket-kamar').modal('hide');
                $('#form-paket-kamar').find('input,select').val('');
                cekTotalHarga();
            });

             $('#mTindakanID').change(function(){
                var harga = $('option:selected', this).attr('data-harga')
                $('#paketTindakanHarga').val(harga);
             });

            $('#simpan-tindakan').click(function(){
                var mTindakanID,paketTindakanJumlah,paketTindakanHarga,paketTindakanSubharga,tindakan_text,mode,counter,id_row,name_harga,name_jumlah;
                var mode = $('#tindakan_mode').val();

                if(mode == 'new')
                {
                    var tr = $('<tr>');
                    counter = tindakan_length+1;
                    tr.attr('id','tindakan_'+counter);
                    tr.attr('data-harga-type','tindakan');
                }
                else
                {
                    id_row = $('#tindakan_edit').val();
                    counter = id_row;
                    var tr = $('#tindakan_'+id_row);
                    tr.empty();
                }


                mTindakanID = $('#mTindakanID').val();
                tindakan_text = $('#mTindakanID option:selected').text();
                paketTindakanJumlah = $('#paketTindakanJumlah').val() ||'';
                paketTindakanHarga = $('#paketTindakanHarga').val() ||0;
                paketTindakanSubharga = paketTindakanHarga * paketTindakanJumlah  || 0;
                

                tr.append('<td>'+tindakan_text+'</td>');
                tr.append('<td data-used="1" data-save="1" data-name="paketDetailJumlah" data-kolom-id="paketTindakanJumlah">'+paketTindakanJumlah+'</td>');
                tr.append('<td data-used="1" data-save="1" data-name="paketDetailHarga" data-kolom-id="paketTindakanHarga">'+paketTindakanHarga+'</td>');
                tr.append('<td class="td-harga" data-used="1" data-kolom-id="paketDetailSubharga">'+paketTindakanSubharga+'</td>');
                tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteTindakan('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editTindakan('+counter+')">Edit</button></td>');
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="tindakans.tindakanID" data-kolom-id="mTindakanID">'+mTindakanID+'</td>');

                if(mode == 'new')
                {
                    tindakan_length = counter;
                    $('#paket-tindakan-list').append(tr);                    
                }

                $('#form-paket-tindakan').modal('hide');
                $('#form-paket-tindakan').find('input,select').val('');
                cekTotalHarga();
            });
         
             $('#penunjangmedisID').change(function(){
                var harga = $('option:selected', this).attr('data-harga')
                $('#paketPenunjangHarga').val(harga);
             });

            $('#simpan-penunjang').click(function(){
                var m_penunjangID,paketPenunjangJumlah,paketPenunjangHarga,paketPenunjangSubharga,penunjangText,mode,counter,id_row,name_harga,name_jumlah;
                var mode = $('#penunjang_mode').val();

                if(mode == 'new')
                {
                    var tr = $('<tr>');
                    counter = penunjang_length+1;
                    tr.attr('id','penunjang_'+counter);
                    tr.attr('data-harga-type','penunjang');
                }
                else
                {
                    id_row = $('#penunjang_edit').val();
                    counter = id_row;
                    var tr = $('#penunjang_'+id_row);
                    tr.empty();
                }


                penunjangmedisID = $('#penunjangmedisID').val();
                penunjangText = $('#penunjangmedisID option:selected').text();
                paketPenunjangJumlah = $('#paketPenunjangJumlah').val() ||'';
                paketPenunjangHarga = $('#paketPenunjangHarga').val() ||0;
                paketPenunjangSubharga = paketPenunjangJumlah * paketPenunjangHarga  || 0;
                

                tr.append('<td>'+penunjangText+'</td>');
                tr.append('<td data-used="1" data-save="1" data-name="paketDetailJumlah" data-kolom-id="paketPenunjangJumlah">'+paketPenunjangJumlah+'</td>');
                tr.append('<td class="td-harga" data-used="1" data-save="1" data-name="paketDetailHarga" data-kolom-id="paketPenunjangHarga">'+paketPenunjangHarga+'</td>');
                tr.append('<td class="td-harga" data-used="1" data-kolom-id="paketDetailSubharga">'+paketPenunjangSubharga+'</td>');
                tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deletePenunjang('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editPenunjang('+counter+')">Edit</button></td>');
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="penunjangs.penunjangmedisID" data-kolom-id="penunjangmedisID">'+penunjangmedisID+'</td>');

                if(mode == 'new')
                {
                    penunjang_length = counter;
                    $('#paket-penunjang-list').append(tr);                    
                }

                $('#form-paket-penunjang').modal('hide');
                $('#form-paket-penunjang').find('input,select').val('');
                cekTotalHarga();

            });

            $('#simpan-barang').click(function(){
                var mBarangID,paketBarangJumlah,paketBarangHarga,paketSatuanID,paketBarangSubharga,barang_text,mode,counter,id_row,name_harga,name;
                var mode = $('#barang_mode').val();

                if(mode == 'new')
                {
                    var tr = $('<tr>');
                    counter = barang_length+1;
                    tr.attr('id','barang_'+counter);
                    tr.attr('data-harga-type','barang');
                }
                else
                {
                    id_row = $('#barang_edit').val();
                    counter = id_row;
                    var tr = $('#barang_'+id_row);
                    tr.empty();
                }

                mBarangID = $('#mBarangID').val();
                barang_text = $('#mBarangID option:selected').text();
                paketSatuanID = $('#paketSatuanID').val() || 0;
                paketSatuanText = $('#paketSatuanID option:selected').text();
                paketBarangJumlah = $('#paketBarangJumlah').val() ||'';
                paketBarangHarga = $('#paketBarangHarga').val() ||0;
                paketBarangSubharga = $('#paketBarangSubharga').val() || 0;
                

                tr.append('<td>'+barang_text+'</td>');
                tr.append('<td>'+paketSatuanText+'</td>');
                tr.append('<td data-used="1" data-save="1" data-name="paketDetailJumlah" data-kolom-id="paketBarangJumlah">'+paketBarangJumlah+'</td>');
                tr.append('<td data-used="1" data-save="1" data-name="paketDetailHarga" data-kolom-id="paketBarangHarga">'+paketBarangHarga+'</td>');
                tr.append('<td class="td-harga" data-used="1" data-kolom-id="paketBarangSubharga">'+paketBarangSubharga+'</td>');
                tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteBarang('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editBarang('+counter+')">Edit</button></td>');
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="obats.obatID" data-kolom-id="mBarangID">'+mBarangID+'</td>');
                tr.append('<td style="display:none" data-used="1" data-save="1" data-kolom-id="paketSatuanID">'+paketSatuanID+'</td>');
                if(mode == 'new')
                {
                    barang_length = counter;
                    $('#paket-barang-list').append(tr);                    
                }

                $('#form-paket-barang').modal('hide');
                $('#form-paket-barang').find('input,select').val('');
                cekTotalHarga();
            });

        });


        function cekTotalHarga() {
            var total = 0;
            $('.td-harga').map(function() {
                total += parseInt($(this).text());
            });
            console.log('total harga paket',total)
            $('#paketHarga').val(total)
        }

        function editKamar(id)
        {
            var tr;
            $('#kamar_mode').val('edit');
            $('#kamar_edit').val(id);
            tr = $('#kamar_'+id);
            $.each(tr.find('td'),function(i,e){
                if($(e).attr("data-used") == '1')
                {
                    var elemID = $(e).attr('data-kolom-id');
                    $('#'+elemID).val($(e).text());
                }
            });
            $('#form-paket-kamar').modal('show');
        } 

        function deleteKamar(id)
        {
            var tr;
            tr = $('#kamar_'+id);
            tr.remove();
            cekTotalHarga();
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
            $('#form-paket-tindakan').modal('show');
        }        

        function deleteTindakan(id)
        {
            var tr;
            tr = $('#tindakan_'+id);
            tr.remove();
            cekTotalHarga();
        } 

        function editPenunjang(id)
        {
            var tr;
            $('#penunjang_mode').val('edit');
            $('#penunjang_edit').val(id);
            tr = $('#penunjang_'+id);
            $.each(tr.find('td'),function(i,e){
                if($(e).attr("data-used") == '1')
                {
                    var elemID = $(e).attr('data-kolom-id');
                    $('#'+elemID).val($(e).text());
                }
            });
            $('#form-paket-penunjang').modal('show');
        }        

        function deletePenunjang(id)
        {
            var tr;
            tr = $('#penunjang_'+id);
            tr.remove();
            cekTotalHarga();
        } 

        function editBarang(id)
        {
            var tr;
            $('#barang_mode').val('edit');
            $('#barang_edit').val(id);
            tr = $('#barang_'+id);
            $.each(tr.find('td'),function(i,e){
                if($(e).attr("data-used") == '1')
                {
                    var elemID = $(e).attr('data-kolom-id');
                    $('#'+elemID).val($(e).text());
                }
            });
            $('#form-paket-barang').modal('show');
        }        

        function deleteBarang(id)
        {
            var tr;
            tr = $('#barang_'+id);
            tr.remove();
            cekTotalHarga();
        }
    </script>