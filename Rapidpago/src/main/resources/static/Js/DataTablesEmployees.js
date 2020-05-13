 $(document).ready(function() {
	 var table = $("#employeesTable").DataTable({
        "order": [0, 'desc'],
        "ajax": {
            "method": "GET",
            "url": "/employees",
            "data": function (d) {
                return $.extend({}, d, {
                    "fecha_inicio": $('#fecha_inicio').val(),
                    "fecha_final": $('#fecha_final').val()
                });
            }
        },
        "columns":
        	[
	        	{ 
	        		"data" : "_embedded.employees.name"
	            }, {
	                "data": "_embedded.employees.lastName"
	            }, {
	                "data" : "_embedded.employees.gender"
	            }, {
	                "data" : "_embedded.employees.identificationNum"
	            }, {
	                "data" : "_embedded.employees.department"
	            }, {
	                "data" : "_embedded.employees.experience"
	            }, {
	                "data" : "_embedded.employees.admisionDate"
	            }, {
	                "data" : "_embedded.employees.address"
	            }, {
	                "data" : "_embedded.employees.available"
	            } 
            ]
    })
});