/**
 * 
 */



// 선수 등록 이벤트
$("#btnSave").click(() => {

	let data = {
		teamId: $("#team").val(),
		name: $("#name").val(),
		position: $("#position").val()
	};
	console.log(data);

	$.ajax("/player/save", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: { // http header에 들고갈 요청 데이터
			"Content-Type": "application/json"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert(res.msg);
			location.href = "/player";
		} else {
			alert("선수 등록이 제대로 되지 않았습니다.");
			history.back();
		}
	});
});


// 선수 checkbox 대량 삭제 이벤트
$("#btnDelete").click((id) => {
	let ids = getDeleteId(id);
	console.log(ids);

	let data = {
		ids: ids
	};

	console.log(data);

	$.ajax("/player/delete", {
		type: "DELETE",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("선수 삭제 완료");
			location.reload();
		} else {
			alert("퇴출에 실패하였습니다.");
		}
	});
});


// checked된 values 담는 함수
function getDeleteId(id) {
	console.log(id);

	var arr = new Array();

	$("input:checkbox[name='id']").each(function() {
		if ($(this).is(":checked") == true) {
			arr.push($(this).val());
		}
	});

	//alert("성공" + arr);
	console.log(arr);

	/* let data = {
		arr:arr
	}; */

	// console.log(data);
	return arr;
}



// 