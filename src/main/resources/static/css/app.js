function validate() {
	var name = document.getElementById("name").value;
	if (name == '') {
		alert('Please enter a valid info.');
		return false;
	} else {
		return true;
	}
}