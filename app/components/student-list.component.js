angular.
  module('mainApp').
  component('studentList', {
    templateUrl: 'components/student-list.template.html',
    controller: function() {
      this.students = [
        {
          name: 'Rajdeep',
          snippet: 'Fast just got faster with Nexus S.'
        }, {
          name: 'Prasanna',
          snippet: 'The Next, Next Generation tablet.'
        }, {
          name: 'Sachin',
          snippet: 'The Next, Next Generation tablet.'
        },  {
          name: 'Chetan',
          snippet: 'The Next, Next Generation tablet.'
        }
      ];
    }
  });
