$(document).ready( function () {
	  $('#employeesTable').DataTable({
			"sAjaxSource": "/employees",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "id"},
		     	{ "mData": "name" },
				{ "mData": "lastName" },
				{ "mData": "gender" },
				{ "mData": "identificationNum" },
				{ "mData": "department" },
				{ "mData": "experience" },
				{ "mData": "admisionDate" },
				{ "mData": "address" },
				{ "mData": "available" }
				
			]
	 })
});


