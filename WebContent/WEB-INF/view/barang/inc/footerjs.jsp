<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">
	var detail_length = $('#detail-list').find('tr').length;

    $(function(){
		$('#simpan-form').click(function () {
            $('#detail-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','detail[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#barangModel').append(new_input);
                    }
                });
            });
			$('#barang-form').submit();
		});
           
        $('#add_detail').click(function(){
            $('#form-detail;').find('input,select').val('');
            $('#detail_mode').val('new');
            $('#modal-detail').modal('show');
        }); 

        $('#simpan-detail').click(function(){
            var mode,counter,id_row;
            
            var mode = $('#detail_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = detail_length+1;
                tr.attr('id','detail_'+counter);
            }
            else
            {
                id_row = $('#detail_edit').val();
                counter = id_row;
                var tr = $('#detail_'+id_row);
                tr.empty();
            }

            barangDetBarangNama = $('#barangDetBarangNama').val();
            barangSatuanId = $('#barangSatuanId').val();
            barangSatuanNama = $('#barangSatuanId option:selected').text();
            barangDetJumlah = $('#barangDetJumlah').val();
            barangDetKeterangan = $('#barangDetKeterangan').val();

            //tr.append('<td>'+tindakanText+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="barangDetBarangNama" data-kolom-id="barangDetBarangNama">'+barangDetBarangNama+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="barangDetSatuanNama" data-kolom-id="barangDetSatuanNama">'+barangDetSatuanNama+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="barangDetJumlah" data-kolom-id="barangDetJumlah">'+barangDetJumlah+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="barangDetKeterangan" data-kolom-id="barangDetKeterangan">'+barangDetBarangKeterangan+'</td>');
            //tr.append('<td>'+pegawaiText+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteTindakan('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editTindakan('+counter+')">Edit</button></td>');
           // tr.append('<td style="display:none" data-used="1" data-save="1" data-name="tindakan.tindakanID" data-kolom-id="tindakanID">'+tindakanID+'</td>');
            tr.append('<td style="display:none" data-used="1" data-save="1" data-name="barangSatuanId" data-kolom-id="barangSatuanId">'+barangSatuanid+'</td>');

            if (barangDetId) {
                tr.append('<td style="display:none" data-used="1" data-save="1" data-name="barangDetId" data-kolom-id="barangDetId">' + barangDetId + '</td>');
            }

            if(mode == 'new')
            {
                detail_length = counter;
                $('#detail-list').append(tr);                    
            }

            $('#modal-detail').modal('hide');
            $('#form-detai').find('input,select').val('');

        });

         /*$('#tindakanID').change(function(){
            var harga = $('option:selected', this).attr('data-harga')
            $('#tindakanpasienHarga').val(harga);
         });*/ 
        // next simpan
    });

    function editDetail(id)
    {
        var tr;
        $('#detail_mode').val('edit');
        $('#detail_edit').val(id);
        tr = $('#detail_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elemID = $(e).attr('data-kolom-id');
                $('#'+elemID).val($(e).text());
            }
        });
        $('#modal-detail').modal('show');
    }

    function deleteDetail(id)
    {
        var tr;
        tr = $('#detail_'+id);
        tr.append('<td style="display:none" data-used="1" data-save="1" data-name="remove" data-kolom-id="remove">1</td>');
        tr.hide();
    }
    </script>