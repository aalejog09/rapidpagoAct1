
$(document).ready(function() {
    var table = $('#employeesTable').DataTable({
    	"columns":[
    	{ 
    		"employees" : "name"
        }, {
            "employees" : "lastName"
        }, {
            "employees" : "gender"
        }, {
            "employees" : "identificationNum"
        }, {
            "employees" : "department"
        }, {
            "employees" : "experience"
        }, {
            "employees" : "admisionDate"
        }, {
            "employees" : "address"
        }, {
            "employees" : "available"
        }, {
            "employees" : "actions"
        }, {
            "employees" : "actions"
        }, {
            "employees" : "actions"
        }  ]
 
    })
});