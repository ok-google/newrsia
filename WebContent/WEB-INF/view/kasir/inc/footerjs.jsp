<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">

	// submit form
	$('#kasir-submit').click(function() {
		$('#kasir-form').submit();
	});

	$('#kasir-submit-tagihan').click(function() {
		$('<input />').attr('type', 'hidden')
			.attr('name', "cetak")
			.attr('value', "tagihan")
			.appendTo('#kasir-form');
		$('#kasir-form').submit();
	});

	$('#kasir-submit-kuitansi').click(function() {
		$('<input />').attr('type', 'hidden')
			.attr('name', "cetak")
			.attr('value', "kuitansi")
			.appendTo('#kasir-form');
		$('#kasir-form').submit();
	});


	$('#uang-bayar').on('input propertychange', function() {
		var harusBayar = cleanNumber($('#harus-bayar').val());
		var bayar = cleanNumber(this.value)
		var kembalian = ((bayar - harusBayar) > 0) ? bayar - harusBayar : 0;
		$('#kembalian').val(formatNumb(kembalian));
	})

	function formatNumb(nStr)
	{
	    nStr += '';
	    x = nStr.split('.');
	    x1 = x[0];
	    x2 = x.length > 1 ? '.' + x[1] : '';
	    var rgx = /(\d+)(\d{3})/;
	    while (rgx.test(x1)) {
	        x1 = x1.replace(rgx, '$1' + '.' + '$2');
	    }
	    return x1 + x2;
	}

	function cleanNumber(str) {
		return str.replace(/\./g,'')
	}
</script>