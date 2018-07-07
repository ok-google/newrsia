<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
$('#simpan-order').click(function(){
    $('.table-form tr').map(function(line){
        $(this).find('td').each(function (i) {
            if($(this).attr('data-save') == '1')
            {
                var name = $(this).attr('data-name');
                var value = $(this).text();
                var new_input = $('<input type="hidden">');
                new_input.attr('name','detail[' + line + '].' + name);
                new_input.attr('value',value);

                $('#order-form').append(new_input);
            }
        });
    });

    $('#order-form').submit();

});
var order_length = 0;

$('#add_order').click(function(){
    $('#form-detail').find('input,select').val('');
    $('#order_mode').val('new');
    $('#form-detail').modal('toggle');
    $('#form-detail').modal('show');
});

$('#simpan-detail').click(function(){
    var nama_barang, satuan, jumlah, harga, sub_total, mode, counter, id_row;
    var mode = $('#order_mode').val();

    if(mode == 'new')
    {
        var tr = $('<tr>');
        counter = order_length+1;
        tr.attr('id','order_'+counter);
    }
    else
    {
        id_row = $('#order_edit').val();
        counter = id_row;
        var tr = $('#order_'+id_row);
        tr.empty();
    }
	
    nama_barang = $('#orderDetailBarangId').val();
    satuan = $('#orderDetailSatuanId').val();
    jumlah = $('#orderDetailJumlah').val() || 0;
    harga = $('#orderDetailHarga').val() ||0;
    sub_total = $('#orderDetailSubTotal').val() || 0;
    
    tr.append('<td>'+nama_barang+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="orderDetailSatuanId" data-kolom-id="satuan">'+satuan+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="orderDetailJumlah" data-kolom-id="jumlah">'+jumlah+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="orderDetailHarga" data-kolom-id="harga">'+harga+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="orderDetailSubTotal" data-kolom-id="sub_total">'+sub_total+'</td>');
    tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteDetail('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editOrder('+counter+')">Edit</button></td>');
    if(mode == 'new')
    {
        tindakan_length = counter;
        $('#order-list').append(tr);                    
    }

    $('#form-detail').modal('hide');
    $('#form-detail').find('input,select').val('');
});	

function editBarang(id)
{
    var tr;
    $('#order_mode').val('edit');
    $('#order_edit').val(id);
    tr = $('#order_'+id);
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
    tr = $('#order_'+id);
    tr.remove();
}
</script>