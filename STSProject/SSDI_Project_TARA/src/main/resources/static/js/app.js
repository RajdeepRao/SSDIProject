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

app.controller('LogIn',function($scope,$rootScope, $location){
  $scope.email="rajdeeprrao94@gmail.com";
  $scope.password="asdf";
  $scope.username="";
  $rootScope.logIn=false;

  $scope.logIn=function(email){
    if(email=="rajdeeprrao94@gmail.com"){
        $rootScope.logIn=true;
        alert('login successful');
        getElementById('myModal').modal('hide');
    }

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

  
  $scope.signUpFunction=function($http){
	  $scope.value=5+$scope.ninerNumber;
	   
  };


});

app.controller('listStudents',function($scope,$http){
  $http.get('http://localhost:8080/data.json')
  .success(function(response){
    $scope.students=response.students;
  });
});
