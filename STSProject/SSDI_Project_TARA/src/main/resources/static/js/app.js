var app = angular.module("myApp",["ngRoute"]);

app.config(function($routeProvider){
  $routeProvider
  .when('/',{
    templateUrl:'landingPage.html'
  })
  .when('/dashboard',{
    resolve: {
      "check": function($location,$rootScope){
          if(!$rootScope.logIn){
            $location.path('/');
          }
      }
    },
    templateUrl:'dashboard.html'
  })
  .otherwise({
    redirectTo: '/'
  })
});

app.controller('LogIn',function($scope,$rootScope, $location, $http){
  $scope.email="rajdeeprrao94@gmail.com";
  $scope.password="asdf";
  $scope.username="";
  $rootScope.logIn=false;

  $scope.logIn=function(email,password){
	  
	  $http.get('http://localhost:8080/students')
	  .success(function(response){
	    //$scope.students=response.students;
		 data=JSON.stringify(response);
		 var jsonObj=JSON.parse(data);
		 for(i=0;i<jsonObj.length;i++){
			 console.log(jsonObj[i].emailId);
			 console.log(jsonObj[i].password);
			 if(jsonObj[i].emailId==email && jsonObj[i].password==password){
				 $rootScope.logIn=true;
			        alert('login successful');
			        getElementById('myModal').modal('hide');
			 }
				 
		 }
		 
	  });
	  
    /*if(email=="rajdeeprrao94@gmail.com"){
        $rootScope.logIn=true;
        alert('login successful');
        getElementById('myModal').modal('hide');
    }*/
    

  };

});

app.controller('SignUp',function($scope, $http, $rootScope, $location){
	
  $scope.role;
  $scope.firstName;
  $scope.lastName;
  $scope.ninerNumber;
  $scope.email;
  $scope.password;
  $scope.value=5;
  $scope.students;

  $rootScope.signUpSuccess=false;

  
  $scope.signUpFunction=function(){
	  $scope.value=5+$scope.ninerNumber;
	  
	  var dataObj = {
				id : $scope.ninerNumber,
				firstName : $scope.firstName,
				lastName : $scope.lastName,
				emailId : $scope.email,
				password : $scope.password
		};	
	  dataObjString=JSON.stringify(dataObj);
	  var dataJsonObj=JSON.parse(dataObjString);
		var res = $http.put('http://localhost:8080/students/6', dataJsonObj);
		res.success(function(data, status, headers, config) {
			$scope.message = data;
		});
		res.error(function(data, status, headers, config) {
			alert( "failure message: " + JSON.stringify({data: data}));
		});	
	   
  };


});

app.controller('listStudents',function($scope,$http){
  $http.get('http://localhost:8080/data2.json')
  .success(function(response){
    //$scope.students=response.students;
	 data=JSON.stringify(response);
	 console.log(data);
    
	 var jsonObj=JSON.parse(data);
	 for(i=0;i<jsonObj.length;i++)
	 console.log(jsonObj[i].firstName);
  });
});
