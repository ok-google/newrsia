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
var opname_length = 0;

$('#add_opname').click(function(){
    $('#form-detail').find('input,select').val('');
    $('#opname_mode').val('new');
    $('#form-detail').modal('toggle');
    $('#form-detail').modal('show');
});

$('#simpan-detail').click(function(){
    var nama_barang, satuan, jumlah, harga, sub_total, mode, counter, id_row;
    var mode = $('#opname_mode').val();

    if(mode == 'new')
    {
        var tr = $('<tr>');
        counter = order_length+1;
        tr.attr('id','order_'+counter);
    }
    else
    {
        id_row = $('#opname_edit').val();
        counter = id_row;
        var tr = $('#opname_'+id_row);
        tr.empty();
    }
	
    nama_barang = $('#opnameDetailBarangNama').val();
	harga 		= $('#opnameDetailHarga').val();
	terima_no	= $('#opnameDetailTerimaNo').val(); 
	satuan 		= $('#opnameDetailSatuanId').val();
	kadaluarsa 	= $('#opnameDetailKadaluarsa').val();
	stok_awal	= $('#opnameDetailStokAwal').val();
	koreksi		= $('#opnameDetailStokKoreksi').val();
	stok_akhir	= $('#opnameDetailStok_akhir').val();
    keterangan	= $('#opnameDetailKeterangan').val();
	
    
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailBarangNama" data-kolom-id="barang">'+nama_barang+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailSatuanId" data-kolom-id="satuan">'+satuan+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailStokAwal" data-kolom-id="StokAwal">'+stok_awal+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailStokKoreksi" data-kolom-id="koreksi">'+koreksi+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailStok_akhie" data-kolom-id="StokAkhir">'+stok_akhir+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailHarga" data-kolom-id="harga">'+harga+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailKadaluarsa" data-kolom-id="StokAwal">'+kadaluarsa+'</td>');
    tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteDetail('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editOrder('+counter+')">Edit</button></td>');
    if(mode == 'new')
    {
        opname_length = counter;
        $('#order-list').append(tr);                    
    }

    $('#form-detail').modal('hide');
    $('#form-detail').find('input,select').val('');
});	

function editBarang(id)
{
    var tr;
    $('#opname_mode').val('edit');
    $('#opname_edit').val(id);
    tr = $('#opname_'+id);
    $.each(tr.find('td'),function(i,e){
        if($(e).attr("data-used") == '1')
        {
            var elem_id = $(e).attr('data-kolom-id');
            $('#'+elem_id).val($(e).text());
        }
    });
    $('#form-opname').modal('show');
}

function deleteDetail(id)
{
    var tr;
    tr = $('#opname_'+id);
    tr.remove();
}
</script>