/**
 * 
 */


// 팀 등록 이벤트
$("#btn").click(() => {
	let id = $("#stadium").val();
	console.log(id);
});

$("#btnSave").click(() => {

	let data = {
		stadiumId: $("#stadium").val(),
		name: $("#name").val()
	};
	console.log(data);

	$.ajax("/team/save", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: { // http header에 들고갈 요청 데이터
			"Content-Type": "application/json"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert(res.msg);
			location.href = "/team";
		} else {
			alert("팀 등록이 제대로 되지 않았습니다.");
			history.back();
		}
	});
});






// 팀 삭제 함수
function deleteTeam(id, obj) {
	let tr = $(obj).parent().parent();

	let data = {
		id: id
	}

	console.log(data);
	console.log(data.id);

	$.ajax("/team/" + data.id + "/delete", {
		type: "DELETE",
		dataType: "json",
		data: data
	}).done((res) => {
		if (res.code == 1) {
			alert(res.msg);
			location.reload();
		} else {
			alert("해체에 실패하였습니다.");
		}
	});
}