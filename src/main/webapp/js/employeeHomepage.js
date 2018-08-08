function createNewBursement() {
	let xhttp = new XMLHttpRequest();
	
	let data = "";
	data = data.concat("bursementtitle=").concat(document.getElementById("bursementtitle").value);
	data = data.concat("&bursementdescription=").concat(document.getElementById("bursementdescription").value);
	data = data.concat("&bursementbalance=").concat(document.getElementById("bursementbalance").value);
	console.log(data);
	
	xhttp.onreadystatechange = function () {
		if(xhttp.readyState == 4 && xhttp.status == 200) {
			console.log("cooking");
			document.getElementById("answerDiv").innerHTML = this.responseText;
		}
	};
	xhttp.open("POST", "/Project1/html/createNewBursement.do",true);
	xhttp.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
	xhttp.send(data);
}

function updatePassword() {
	let xhttp = new XMLHttpRequest();

	console.log(document.getElementById("newPassword").value);
	let data = "";
	data = data.concat("newPassword=").concat(document.getElementById("newPassword").value);
	
	
	xhttp.onreadystatechange = function () {
		if(xhttp.readyState == 4 && xhttp.status == 200) {
			console.log("helod");	
			document.getElementById("answerDiv").innerHTML = this.responseText;
		}
	};
	xhttp.open("POST", "/Project1/updatePassword.do", true);
	xhttp.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
	xhttp.send(data);
}

function viewAccount() {
	let xhttp = new XMLHttpRequest();

	xhttp.onreadystatechange = function () {
		if(xhttp.readyState == 4 && xhttp.status == 200) {
			document.getElementById("answerDiv").innerHTML = this.responseText;
		}
	};
	xhttp.open("POST", "/Project1/viewAccount.do");
	xhttp.send();
}

function viewResolvedRequests() {
	let xhttp = new XMLHttpRequest();

	xhttp.onreadystatechange = function () {
		if(xhttp.readyState == 4 && xhttp.status == 200) {
			document.getElementById("answerDiv").innerHTML = this.responseText;
		}
	};
	xhttp.open("POST", "/Project1/viewResolvedRequests.do");
	xhttp.send();
}

function viewPendingRequests() {
	let xhttp = new XMLHttpRequest();

	xhttp.onreadystatechange = function () {
		if(xhttp.readyState == 4 && xhttp.status == 200) {
			document.getElementById("answerDiv").innerHTML = this.responseText;
		}
	};
	xhttp.open("POST", "/Project1/viewPendingRequests.do");
	xhttp.send();
}