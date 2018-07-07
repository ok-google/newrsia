<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">
$('#simpan-returJual').click(function(){
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

                $('#returJual-form').append(new_input);
            }
        });
    });

    $('#returJual-form').submit();

});
var returJual_length = 0;

$('#add_detail').click(function(){
    $('#form-detail').find('input,select').val('');
    $('#detail_mode').val('new');
    $('#form-detail').modal('toggle');
    $('#form-detail').modal('show');
});

$('#simpan-detail').click(function(){
    var nama_barang, satuan, jumlah, harga, kadaluarsa, sub_total, mode, counter, id_row;
    var mode = $('#detail_mode').val();

    if(mode == 'new')
    {
        var tr = $('<tr>');
        counter = returJual_length+1;
        tr.attr('id','returJual_'+counter);
    }
    else
    {
        id_row = $('#returJual_edit').val();
        counter = id_row;
        var tr = $('#returJual_'+id_row);
        tr.empty();
    }
    
    nama_barang = $('#ReturJualDetailBarangId').val();
    kadaluarsa = $('#ReturJualDetailKadaluarsa').val()
    satuan = $('#ReturJualDetailSatuanId').val();
    jumlah = $('#ReturBeliDetailJumlah').val() || 0;
    harga = $('#ReturJualDetailHarga').val() ||0;
    sub_total = $('#ReturJualDetailSubTotal').val() || 0;
    
    // data-kolom-id sesuaikan dengan id input di modal
    //tr.append('<td>'+nama_barang+'</td>');
    // tr.append('<td data-used="1" data-save="1" data-name="orderDetailSatuanId" data-kolom-id="satuan">'+satuan+'</td>');
    //conto
    tr.append('<td data-used="1" data-save="1" data-name="ReturJualDetailBarangId" data-kolom-id="ReturJualDetailBarangId">'+nama_barang+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="ReturJualDetailSatuanId" data-kolom-id="ReturJualDetailSatuanId">'+satuan+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="ReturJualDetailKadaluarsa" data-kolom-id="ReturJualDetailKadaluarsa">'+kadaluarsa+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="ReturJualDetailJumlah" data-kolom-id="ReturJualDetailJumlah">'+jumlah+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="ReturJualDetailHarga" data-kolom-id="ReturJualDetailHarga">'+harga+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="ReturJualDetailSubTotal" data-kolom-id="ReturJualDetailSubTotal">'+sub_total+'</td>');
    tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteDetail('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editBarang('+counter+')">Edit</button></td>');
    if(mode == 'new')
    {
        returJual_length = counter;
        // append to tbody
        $('#returJual-list').append(tr);                    
    }

    $('#form-detail').modal('hide');
    $('#form-detail').find('input,select').val('');
}); 

function editBarang(id)
{
    var tr;
    $('#detail_mode').val('edit');
    $('#detail_edit').val(id);
    tr = $('#returJual_'+id);
    $.each(tr.find('td'),function(i,e){
        if($(e).attr("data-used") == '1')
        {
            var elem_id = $(e).attr('data-kolom-id');
            $('#'+elem_id).val($(e).text());
        }
    });
    $('#form-order').modal('show');
}

function deleteDetail(id)
{
    var tr;
    tr = $('#returJual_'+id);
    tr.remove();
}
</script>