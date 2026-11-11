# Software Quality Assurance Plan

## 1. Quality objectives
- Correctly implement the requirements approved in the SRS.
- Prevent unauthorized access to administrator functions.
- Ensure eligibility decisions are consistent and explain unmet criteria.
- Validate input and provide understandable error feedback.
- Maintain traceable requirements, tests, defects, and metrics.

## 2. Quality activities
| Activity | Evidence |
|---|---|
| Requirements review | Review checklist and updated SRS |
| Design review | Reviewed architecture and database design |
| Code review | Pull requests or documented peer reviews |
| Unit testing | JUnit test results |
| Functional/system testing | Executed test cases |
| Defect management | Defect log with severity and status |
| Quality measurement | Metrics report |

## 3. Standards and practices
Use consistent Java naming and formatting, meaningful commits, small reviewable changes, input validation, parameterized SQL, and separation of UI, business logic, and persistence.

## 4. Roles
All three group members collaborate on requirements, design, development, database management, testing, documentation, GitHub collaboration, quality metrics, presentation, and viva, as stated in the proposal. Specific task ownership can be recorded in GitHub issues.

## 5. Entry and exit criteria
Testing begins when the relevant feature and test data are available. A feature is ready for release review when its planned tests have been executed, critical defects are closed, and remaining defects are documented.

## 6. Change control
Record requirement changes as GitHub issues, assess their impact, update affected documents/tests, and merge reviewed changes through commits or pull requests.
