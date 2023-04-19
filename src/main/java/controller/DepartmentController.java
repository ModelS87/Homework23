package controller;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService departmentService;
    public DepartmentController(DepartmentService departmentService) {
            this.departmentService = departmentService;
        }
        @GetMapping("/max-salary")
        public Employee findEmployeeWithMaxSalaryFromDepartment(
                @RequestParam("departmentId") int department) {
            return departmentService.findEmployeeWithMaxSalaryFromDepartment(department);
        }

        @GetMapping("/min-salary")
        public Employee findEmployeeWithMinSalaryFromDepartment(
                @RequestParam("departmentId") int department) {
            return departmentService.findEmployeeWithMinSalaryFromDepartment(department);
        }

        @GetMapping(value = "/all", params = "departmentId")
        public List<Employee> findEmployeesFromDepartment(@RequestParam("departmentId") int department) {
            return departmentService.findAllEmployeesFromDepartment(department);
        }

        @GetMapping("/all")
        public Map<Integer, List<Employee>> findEmployees() {
            return departmentService.findEmployeesByDepartment();
        }

    }

