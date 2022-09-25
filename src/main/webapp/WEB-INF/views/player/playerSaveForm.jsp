<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<div class="container">
	<h1 style="text-align:center">팀 등록</h1>
	<form>
      <div class="d-flex justify-content-center">
         <select id="team">
            <option value="none">== 팀 선택 ==</option>
            <c:forEach var="team" items="${teamList}">
               <option value="${team.id}">${team.name}</option>
            </c:forEach>
         </select>
         <div class="d-flex align-items-center" style="width: 300px">
         	<div style="width: 90px">선수명 : </div>
           <input id="name" class="form-control" placeholder="선수 이름 작성" />
         </div>
         <div class="d-flex align-items-center" style="width: 300px">
         	<div style="width: 90px">포지션 : </div>
         	<input id="position" class="form-control" placeholder="포지션 작성" />
         </div>
         <button id="btnSave" type="button" class="btn btn-primary">등록</button>
      </div>
   </form>
</div>

<script src="/js/player.js"></script>

<%@ include file="../layout/footer.jsp" %>