<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
$('#simpan-terima').click(function(){
    // tambahkan class table-form di tbody <<<<<<<
    $('.table-form tr').map(function(line){
        $(this).find('td').each(function (i) {
            if($(this).attr('data-save') == '1')
            {
                var name = $(this).attr('data-name');
                var value = $(this).text();
                var new_input = $('<input type="hidden">');
                new_input.attr('name','detail[' + line + '].' + name);
                new_input.attr('value',value);

                $('#terima-form').append(new_input);
            }
        });
    });

    $('#terima-form').submit();

});
var terima_length = 0;

$('#add_terima').click(function(){
    $('#form-detail').find('input,select').val('');
    $('#terima_mode').val('new');
    $('#form-detail').modal('toggle');
    $('#form-detail').modal('show');
});

$('#simpan-detail').click(function(){
    var nama_barang, satuan, jumlah, harga, sub_total, mode, counter, id_row;
    var mode = $('#terima_mode').val();

    if(mode == 'new')
    {
        var tr = $('<tr>');
        counter = terima_length+1;
        tr.attr('id','terima_'+counter);
    }
    else
    {
        id_row = $('#terima_edit').val();
        counter = id_row;
        var tr = $('#terima_'+id_row);
        tr.empty();
    }
	
    nama_barang = $('#terimaDetailBarangId').val();
    satuan = $('#terimaDetailSatuan').val();
    jumlah = $('#terimaDetailJumlah').val() || 0;
    harga = $('#terimaDetailHarga').val() ||0;
    sub_total = $('#terimaDetailSubTotal').val() || 0;
    // data-kolom-id sesuaikan dengan id input di modal
    
    tr.append('<td data-used="1" data-save="1" data-name="terimaDetailBarangId" data-kolom-id="barang">'+nama_barang+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="terimaDetailSatuan" data-kolom-id="satuan">'+satuan+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="terimaDetailJumlah" data-kolom-id="jumlah">'+jumlah+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="terimaDetailHarga" data-kolom-id="harga">'+harga+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="terimaDetailSubTotal" data-kolom-id="sub_total">'+sub_total+'</td>');
    tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteDetail('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editOrder('+counter+')">Edit</button></td>');
    if(mode == 'new')
    {
        tindakan_length = counter;
        $('#terima-list').append(tr);                    
    }

    $('#form-detail').modal('hide');
    $('#form-detail').find('input,select').val('');
});	

function editBarang(id)
{
    var tr;
    $('#terima_mode').val('edit');
    $('#terima_edit').val(id);
    tr = $('#terima_'+id);
    $.each(tr.find('td'),function(i,e){
        if($(e).attr("data-used") == '1')
        {
            var elem_id = $(e).attr('data-kolom-id');
            $('#'+elem_id).val($(e).text());
        }
    });
    $('#form-detail').modal('show');
}

function deleteDetail(id)
{
    var tr;
    tr = $('#terima_'+id);
    tr.remove();
}
</script>