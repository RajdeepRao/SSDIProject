var mainApp=angular.module('mainApp', []);

mainApp.controller('ctrl1', function($scope){

    $scope.first=1;
    $scope.second=1;
    $scope.updateValues=function(){
      $scope.calculation = $scope.first + ' + ' + $scope.second + " = " + (+$scope.first + +$scope.second);    };

});
