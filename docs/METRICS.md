# Quality Metrics

Record raw counts, date range, build/version, and evidence whenever reporting metrics.

## 1. Test pass rate
**Formula:** (Passed test cases / Executed test cases) × 100

Do not include not-run tests in the denominator. Report blocked tests separately.

## 2. Requirements test coverage
**Formula:** (Requirements with at least one executed linked test / Total approved testable requirements) × 100

Maintain links between SRS requirement IDs and test case IDs.

## 3. Defect summary
Report defects by severity and status. If defect density is used, define the size measure and count consistently before comparing builds.

## 4. Report template
- Build/version:
- Reporting period:
- Executed / passed / failed / blocked tests:
- Test pass rate:
- Approved testable requirements:
- Requirements covered by executed tests:
- Requirements test coverage:
- Open defects by severity:
- Evidence / limitations:

No project results are claimed until tests have actually been run and counted.
