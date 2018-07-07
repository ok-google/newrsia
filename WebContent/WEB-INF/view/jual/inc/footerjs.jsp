<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">
$('#simpan-jual').click(function(){
    // tambahkan class table-form di tbody
    $('.table-form tr').map(function(line){
        $(this).find('td').each(function (i) {
            if($(this).attr('data-save') == '1')
            {
                var name = $(this).attr('data-name');
                var value = $(this).text();
                var new_input = $('<input type="hidden">');
                // input name nya sesuaikan dengan property one to many entity 
                new_input.attr('name','detail[' + line + '].' + name);
                new_input.attr('value',value);

                $('#jual-form').append(new_input);
            }
        });
    });

    $('#jual-form').submit();

});
var jual_length = 0;

$('#add_detail').click(function(){
    $('#form-detail').find('input,select').val('');
    $('#detail_mode').val('new');
    $('#form-detail').modal('toggle');
    $('#form-detail').modal('show');
});

$('#simpan-detail').click(function(){
    var nama_barang, satuan, jumlah, harga, sub_total, mode, counter, id_row;
    var mode = $('#detail_mode').val();

    if(mode == 'new')
    {
        var tr = $('<tr>');
        counter = jual_length+1;
        tr.attr('id','jual_'+counter);
    }
    else
    {
        id_row = $('#jual_edit').val();
        counter = id_row;
        var tr = $('#jual_'+id_row);
        tr.empty();
    }
    
    nama_barang = $('#jualDetailBarangId').val();
    satuan = $('#jualDetailSatuanId').val();
    jumlah = $('#jualDetailJumlah').val() || 0;
    harga = $('#jualDetailHarga').val() ||0;
    sub_total = $('#jualDetailSubTotal').val() || 0;
    
    // data-kolom-id sesuaikan dengan id input di modal
    tr.append('<td>'+nama_barang+'</td>');
    // tr.append('<td data-used="1" data-save="1" data-name="orderDetailSatuanId" data-kolom-id="satuan">'+satuan+'</td>');
    //conto
    tr.append('<td data-used="1" data-save="1" data-name="jualDetailSatuanId" data-kolom-id="jualDetailSatuanId">'+satuan+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="jualDetailJumlah" data-kolom-id="jumlah">'+jumlah+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="jualDetailHarga" data-kolom-id="harga">'+harga+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="jualDetailSubTotal" data-kolom-id="sub_total">'+sub_total+'</td>');
    tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteDetail('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editBarang('+counter+')">Edit</button></td>');
    if(mode == 'new')
    {
        jual_length = counter;
        // append to tbody
        $('#jual-list').append(tr);                    
    }

    $('#form-detail').modal('hide');
    $('#form-detail').find('input,select').val('');
}); 

function editBarang(id)
{
    var tr;
    $('#detail_mode').val('edit');
    $('#detail_edit').val(id);
    tr = $('#jual_'+id);
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
    tr = $('#jual_'+id);
    tr.remove();
}
</script>