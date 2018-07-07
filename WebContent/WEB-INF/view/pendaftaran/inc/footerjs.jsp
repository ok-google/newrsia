<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(document).ready(function(){
		$("#add_Pendaftaran").click(function(){
			$("#add_Pendaftaran_form").slideToggle('slow');
		});
	});
	$('#kondisi_pasien').on('change', function() {
		var kondisi_datang = this.value ;

		if (kondisi_datang == 'D') {
			$('#form-rujukan').hide(500);
		} else {
			$('#form-rujukan').show(500);
		}
	})
	$('#jenis_daftar').on('change', function() {
		if (this.value == 'RI') {
			$('#form-rawat-inap').show(500);
			$('#form-rawat-jalan').hide(500);
		} else if (this.value == 'RJ') {
			$('#form-rawat-inap').hide(500);
			$('#form-rawat-jalan').show(500);
		} else {
			$('#form-rawat-inap').hide(500);
			$('#form-rawat-jalan').hide(500);
		}
	})

=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(document).ready(function(){
		$("#add_Pendaftaran").click(function(){
			$("#add_Pendaftaran_form").slideToggle('slow');
		});
	});

    if ($('#cara_masuk').val() == 'D') {
        $('#form-rujukan').find('input, select').each(function () {
            $(this).attr('disabled',true);
        });
    	$('#form-rujukan').hide();
    } else {
        $('#form-rujukan').find('input, select').each(function () {
            $(this).attr('disabled',false);
        });
    	$('#form-rujukan').show();
    }

    if ($('#jenis_daftar').val() == 'RI') {
        $('#form-rawat-inap').find('input, select').each(function () {
            $(this).attr('disabled',false);
        });
        $('#form-rawat-jalan').find('input, select').each(function () {
            $(this).attr('disabled',true);
        });
		$('#form-rawat-inap').show();
		$('#form-rawat-jalan').hide();
    } else if (this.value == 'RJ') {
        $('#form-rawat-inap').find('input, select').each(function () {
            $(this).attr('disabled',true);
        });
        $('#form-rawat-jalan').find('input, select').each(function () {
            $(this).attr('disabled',false);
        });
		$('#form-rawat-inap').hide();
		$('#form-rawat-jalan').show();
    } else {
        $('#form-rawat-inap').find('input, select').each(function () {
            $(this).attr('disabled',true);
        });
        $('#form-rawat-jalan').find('input, select').each(function () {
            $(this).attr('disabled',true);
        });
		$('#form-rawat-inap').hide();
		$('#form-rawat-jalan').hide();
    }

	$('#cara_masuk').on('change', function() {
		var kondisi_datang = this.value ;

		if (kondisi_datang == 'D') {
            $('#form-rujukan').find('input, select').each(function () {
                $(this).attr('disabled',true);
            });
			$('#form-rujukan').hide(500);
		} else {
            $('#form-rujukan').find('input, select').each(function () {
                $(this).attr('disabled',false);
            });
			$('#form-rujukan').show(500);
		}
	})

	$('#jenis_daftar').on('change', function() {
		if (this.value == 'RI') {
	        $('#form-rawat-inap').find('input, select').each(function () {
	            $(this).attr('disabled',false);
	        });
	        $('#form-rawat-jalan').find('input, select').each(function () {
	            $(this).attr('disabled',true);
	        });
			$('#form-rawat-inap').show(500);
			$('#form-rawat-jalan').hide(500);
		} else if (this.value == 'RJ') {
	        $('#form-rawat-inap').find('input, select').each(function () {
	            $(this).attr('disabled',true);
	        });
	        $('#form-rawat-jalan').find('input, select').each(function () {
	            $(this).attr('disabled',false);
	        });
			$('#form-rawat-inap').hide(500);
			$('#form-rawat-jalan').show(500);
		} else {
	        $('#form-rawat-inap').find('input, select').each(function () {
	            $(this).attr('disabled',true);
	        });
	        $('#form-rawat-jalan').find('input, select').each(function () {
	            $(this).attr('disabled',true);
	        });
			$('#form-rawat-inap').hide(500);
			$('#form-rawat-jalan').hide(500);
		}
	})

>>>>>>> 55d6c2dc35b6f6676414e809ba5ad18603d3f01e
</script>