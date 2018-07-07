<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="/resources/js/select2.min.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
        $('.select2-multiple').select2();
    });
</script>
<script type="text/javascript">

    // var tbody = 
    $('#jenis_penunjang').change(function(){

        switch(jenis) {
            case 'nilai':

                break;
            case 'kesimpulan':

                break;
            case 'file':

                break;
            default:
                console.log('pilih jenis terlebih dahulu')
        }
    })

    var tarif_length = $('#penunjang-tarif-list').find('tr').length;
    var pemeriksaan_length = $('#penunjang-pemeriksaan-list').find('tr').length;

    $(function() {
        // main form
        $('#simpan-penunjang').click(function () {
            $('#penunjang-tarif-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','penunjangkelas[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#penunjang-form').append(new_input);
                    }
                });
            });
            $('#penunjang-pemeriksaan-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','paramperiksa[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#penunjang-form').append(new_input);
                    }
                });
            });
            // replace attr name select muitiple
            var multiselect = ''
            var kategories = $('#penunjang-form').find('select[name="pkategori[]"]').val();
            if (kategories) {
                kategories.map(function (i) {
                    multiselect += '<input type="hidden" name="penunjangkategori['+i+'].jenislayanan.jenislayanan_id" />'
                })
                $('#penunjang-form').append(multiselect)
            }

            $('#penunjang-form').submit();
        });

        $('#add_tarif').click(function(){
            $('#form-tarif').find('input,select').val('');
            $('#tarif_mode').val('new');
            $('#form-penunjang-tarif').modal('show');
        });

        $('#add_pemeriksaan').click(function(){
            $('#form-pemeriksaan').find('input,select').val('');
            $('#pemeriksaan_mode').val('new');
            $('#form-penunjang-pemeriksaan').modal('show');
        });

        $('#simpan-tarif').click(function(){
            var penunjangTarifKelas,penunjangkelas_id,kelas_text,penunjangTarifHarga,mode,counter,id_row;
            var mode = $('#tarif_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = tarif_length+1;
                tr.attr('id','tarif_'+counter);
            }
            else
            {
                id_row = $('#tarif_edit').val();
                counter = id_row;
                var tr = $('#tarif_'+id_row);
                tr.empty();
            }

            penunjangkelas_id = $('#penunjangkelas_id').val() || false;
            kelas_text = $('#penunjangTarifKelas option:selected').text();
            penunjangTarifKelas = $('#penunjangTarifKelas').val() ||0;
            penunjangTarifHarga = $('#penunjangTarifHarga').val() ||0;
            
            tr.append('<td>'+kelas_text+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="penunjangkelasHarga" data-kolom-id="penunjangTarifHarga">'+penunjangTarifHarga+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteTarif('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editTarif('+counter+')">Edit</button></td>');
            tr.append('<td style="display:none" data-used="1" data-save="1" data-name="kelases.kelasID" data-kolom-id="penunjangTarifKelas">'+penunjangTarifKelas+'</td>');
            console.log(penunjangkelas_id)
            if (penunjangkelas_id) {
               tr.append('<td style="display:none" data-used="1" data-save="1" data-name="penunjangkelas_id" data-kolom-id="penunjangkelas_id">'+penunjangkelas_id+'</td>');
            }

            if(mode == 'new')
            {
                tarif_length = counter;
                $('#penunjang-tarif-list').append(tr);
            }

            $('#form-penunjang-tarif').modal('hide');
            $('#form-tarif').find('input,select').val('');

        });


        $('#simpan-pemeriksaan').on('click',function(){
            var pemeriksaan_detail,detail_text,nilai_normal,satuan,mode,counter,id_row;
            var mode = $('#pemeriksaan_mode').val();
            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = pemeriksaan_length+1;
                tr.attr('id','pemeriksaan_'+counter);
            }
            else
            {
                id_row = $('#pemeriksaan_edit').val();
                counter = id_row;
                var tr = $('#pemeriksaan_'+id_row);
                tr.empty();
            }

            detail_text = $('#pemeriksaan_detail option:selected').text();
            paramperiksaNama = $('#paramperiksaNama').val() ||0;
            paramperiksaStandar = $('#paramperiksaStandar').val() ||0;
            paramperiksaSatuan = $('#paramperiksaSatuan').val() ||0;
            paramperiksaHarga = $('#paramperiksaHarga').val() ||0;
            penunjangType = $('#penunjang-tarif-list').attr('data-type');
            tr.append('<td data-used="1" data-save="1" data-name="paramperiksaNama" data-kolom-id="paramperiksaNama">'+paramperiksaNama+'</td>');
            if (penunjangType === 'nilai' || penunjangType == 'kesimpulan') 
            {
                tr.append('<td data-used="1" data-save="1" data-name="paramperiksaStandar" data-kolom-id="paramperiksaStandar">'+paramperiksaStandar+'</td>');
                if (penunjangType == 'nilai')
                {
                    tr.append('<td data-used="1" data-save="1" data-name="paramperiksaSatuan" data-kolom-id="paramperiksaSatuan">'+paramperiksaSatuan+'</td>');
                }
            }
            tr.append('<td data-used="1" data-save="1" data-name="paramperiksaHarga" data-kolom-id="paramperiksaHarga">'+paramperiksaHarga+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deletePemeriksaan('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editPemeriksaan('+counter+')">Edit</button></td>');
            console.log(tr)
            if(mode == 'new')
            {
                pemeriksaan_length = counter;
                $('#penunjang-pemeriksaan-list').append(tr);                    
            }

            $('#form-penunjang-pemeriksaan').modal('hide');
            $('#form-pemeriksaan').find('input,select').val('');

        });

    });

    function editTarif(id)
    {
        var tr;
        $('#tarif_mode').val('edit');
        $('#tarif_edit').val(id);
        tr = $('#tarif_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elem_id = $(e).attr('data-kolom-id');
                $('#'+elem_id).val($(e).text());
            }
        });
        $('#form-penunjang-tarif').modal('show');
    } 

    function deleteTarif(id)
    {
        var tr;
        tr = $('#tarif_'+id);
        tr.remove();
    }

    function editPemeriksaan(id)
    {
        var tr;
        $('#pemeriksaan_mode').val('edit');
        $('#pemeriksaan_edit').val(id);
        tr = $('#pemeriksaan_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elem_id = $(e).attr('data-kolom-id');
                $('#'+elem_id).val($(e).text());
            }
        });
        $('#form-penunjang-pemeriksaan').modal('show');
    } 

    function deletePemeriksaan(id)
    {
        var tr;
        tr = $('#pemeriksaan_'+id);
        tr.remove();
    }
</script>