angular.module('gcb')
    .directive('DataTable', function () {
        return {
            restrict: 'E, A, C',
            link: function (scope, element, attrs, controller) {
                //scope - directive internal scope

                var dataTable = element.dataTable(scope.options); //init plugin

                var mapToDatatableFormat = function (data) {
                    return data.map(scope.options.columnMap)
                }

                scope.$watch('items', function (newData) {
                    console.log("new items:", scope.options);
                    if (newData) {
                        dataTable.fnClearTable();
                        dataTable.fnAddData( mapToDatatableFormat(newData) )
                    }
                }, true);

                dataTable.on('select', function (e, dt, type, indexes) {
                    var rowData = table.rows( indexes ).data().toArray();
                });
                dataTable.on('deselect', function (e, dt, type, indexes) {
                    var rowData = table.rows( indexes ).data().toArray();
                });

            },
            scope: {
                options: "=",
                items: "="
            }
        };
    });