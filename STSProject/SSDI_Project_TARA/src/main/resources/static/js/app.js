var app = angular.module("myApp",["ngRoute", "ngCookies"]);

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


app.controller('LogIn',function($scope,$rootScope, $location, $http, $cookies){
  $scope.email="rrao6@uncc.edu";
  $scope.password="rajdeep1994";
  $scope.username;
  $scope.role;
  $rootScope.logIn=false;
  
  $scope.logIn=function(email,password){
	  
	  	if($scope.role=="Student" || $scope.role=="student" ){
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
		  				console.log(jsonObj[i].firstName);
		  				$rootScope.username=jsonObj[i].firstName;
		  				console.log($scope.username);
		  				$scope.myUrl = $location.path('/dashboard');
		  				console.log($scope.myUrl);
		  				alert('login successful');
	  			        getElementById('myModal').modal('hide');
	  			        
	  			        
	  			 }
	  				 
	  		 }
	  		
	  		
	  		
	  	  });

	  		
	  	}
	  	
	  	
	  	if($scope.role=="Professor" || $scope.role=="professor" ){
	  		$http.get('http://localhost:8080/professors')
	  	  .success(function(response){
	  	    //$scope.students=response.students;
	  		 data=JSON.stringify(response);
	  		 var jsonObj=JSON.parse(data);
	  		 for(i=0;i<jsonObj.length;i++){
	  			 console.log(jsonObj[i].emailId);
	  			 console.log(jsonObj[i].password);
	  			 if(jsonObj[i].emailId==email && jsonObj[i].password==password){
	  				 $rootScope.logIn=true;
	  				$rootScope.username=jsonObj[i].firstName;
	  			        alert('login successful');
	  			        getElementById('myModal').modal('hide');
	  			        $scope.myUrl = $location.path('/dashboardProf');

	  			 }
	  				 
	  		 }
	  		 
	  	  });
	  		
	  	}
    

  };

});

app.controller('SignUp',function($scope, $http, $rootScope, $location, $cookies){
	
  $scope.role;
  $scope.firstName;
  $scope.lastName;
  $scope.ninerNumber;
  $scope.email;
  $scope.password;
  $scope.value=5;
  $scope.students;

  
  $scope.signUpFunction=function(){
	  
	  var dataObj = {
				firstName : $scope.firstName,
				lastName : $scope.lastName,
				emailId : $scope.email,
				password : $scope.password,
				ninerId : $scope.ninerNumber
		};	
	  dataObjString=JSON.stringify(dataObj);
	  var dataJsonObj=JSON.parse(dataObjString);
		
	  	if($scope.role=="Student" || $scope.role=="student" ){
	  		
	  		var res = $http.put('http://localhost:8080/students', dataJsonObj);
			res.success(function(data, status, headers, config) {
				$scope.message = data;
				
				
			});
			res.error(function(data, status, headers, config) {
				alert( "failure message: " + JSON.stringify({data: data}));
			});	
			$rootScope.username=$scope.firstName;
			$rootScope.logIn=true;

	  	}
	  	else if($scope.role=="Professor"|| $scope.role=="professor"){
	  		
	  		var res = $http.put('http://localhost:8080/professors', dataJsonObj);
			console.log($scope.ninerNumber);
			res.success(function(data, status, headers, config) {
				$scope.message = data;
				
			});
			res.error(function(data, status, headers, config) {
				alert( "failure message: " + JSON.stringify({data: data}));
			});	
			$rootScope.username=$scope.firstName;
			$rootScope.logIn=true;

	  	}
	  	else{
	  		alert("Invalid role");
	  	}
	   
  };


});

app.controller('SignOut', function($scope,$rootScope,$location){
	$scope.signout=function(){
		console.log($rootScope.logIn);
		$rootScope.logIn=false;
	};
});

app.controller('positions', function($scope,$http){
	$scope.name="asdasd";
	$http.get('http://localhost:8080/positions')
	  .success(function(response){
	    //$scope.students=response.students;
		 data=JSON.stringify(response);
		 var jsonObj=JSON.parse(data);
		 $scope.pos=jsonObj;
		 for(i=0;i<jsonObj.length;i++){
			 console.log($scope.pos[i]);
		 }
		 
	  });	 
});

