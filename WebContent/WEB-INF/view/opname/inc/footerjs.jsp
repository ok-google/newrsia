<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">
$('#simpan-opname').click(function(){
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

                $('#opname-form').append(new_input);
            }
        });
    });

    $('#opname-form').submit();

});
var opname_length = 0;

$('#add_detail').click(function(){
    $('#form-detail').find('input,select').val('');
    $('#detail_mode').val('new');
    $('#form-detail').modal('toggle');
    $('#form-detail').modal('show');
});

$('#simpan-detail').click(function(){
    alert('jalan');
    var no_terima, nama_barang, satuan, kadaluarsa, stok_awal, koreksi, stok_akhir, harga, keterangan, mode, counter, id_row;
    var mode = $('#detail_mode').val();

    if(mode == 'new')
    {
        var tr = $('<tr>');
        counter = opname_length+1;
        tr.attr('id','opname_'+counter);
    }
    else
    {
        id_row = $('#opname_edit').val();
        counter = id_row;
        var tr = $('#opname_'+id_row);
        tr.empty();
    }
    
    /*nama_barang = $('#opnameDetailBarangId').val();
    satuan = $('#opnameDetailSatuanId').val();
    jumlah = $('#opnameDetailJumlah').val() || 0;
    harga = $('#opnameDetailHarga').val() ||0;
    sub_total = $('#opnameDetailSubTotal').val() || 0;
    */

    no_terima = $('#opnameDetailTerimaNo').val();
    nama_barang = $('#opnameDetailBarangId').val();
    kadaluarsa = $('#opnameDetailKadaluarsa').val();
    satuan = $('#opnameDetailSatuanId').val();
    stok_awal = $('#opnameDetailStokAwal').val();
    koreksi = $('#opnameDetailStokKoreksi').val();
    stok_akhir = $('#opnameDetailStok_akhir').val();
    harga = $('#opnameDetailHarga').val();
    keterangan = $('#opnameDetailKeterangan').val();
    
    // data-kolom-id sesuaikan dengan id input di modal
    //tr.append('<td>'+nama_barang+'</td>');
    // tr.append('<td data-used="1" data-save="1" data-name="orderDetailSatuanId" data-kolom-id="satuan">'+satuan+'</td>');
    //conto
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailTerimaNo" data-kolom-id="opnameDetailTerimaNo">'+no_terima+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailBarangId" data-kolom-id="opnameDetailBarangId">'+nama_barang+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailSatuanId" data-kolom-id="opnameDetailSatuanId">'+satuan+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailKadaluarsa" data-kolom-id="opnameDetailKadaluarsa">'+kadaluarsa+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailStokAwal" data-kolom-id="opnameDetailStokAwal">'+stok_awal+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailKoreksi" data-kolom-id="opnameDetailStokKoreksi">'+koreksi+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailStok_akhir" data-kolom-id="opnameDetailStok_akhir">'+stok_akhir+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailHarga" data-kolom-id="opnameDetailHarga">'+harga+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="opnameDetailKeterangan" data-kolom-id="opnameDetailKeterangan">'+keterangan+'</td>');
    tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteDetail('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editDetail('+counter+')">Edit</button></td>');
    {
        opname_length = counter;
        // append to tbody
        $('#opname-list').append(tr);                    
    }

    $('#form-detail').modal('hide');
    $('#form-detail').find('input,select').val('');
}); 

function editDetail(id)
{
    var tr;
    $('#detail_mode').val('edit');
    $('#detail_edit').val(id);
    tr = $('#opname_'+id);
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
    tr = $('#opname_'+id);
    tr.remove();
}
</script>