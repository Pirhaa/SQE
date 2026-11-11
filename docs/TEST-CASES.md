# Initial Test Cases

| ID | Requirement | Scenario / input | Expected result |
|---|---|---|---|
| TC-01 | FR-01 | Register with valid required details | Student account is created |
| TC-02 | FR-01 | Register with an already-used account identifier | Clear validation error; duplicate account not created |
| TC-03 | FR-01 | Log in with valid credentials | Student reaches student area |
| TC-04 | FR-01 | Log in with incorrect password | Access denied with clear error |
| TC-05 | FR-02 | Save a valid academic profile | Profile is saved and can be viewed again |
| TC-06 | FR-03/04 | Search for a known scholarship | Matching scholarship details and deadline are displayed |
| TC-07 | FR-05/06 | Profile satisfies all configured criteria | Scholarship is marked eligible |
| TC-08 | FR-07 | Profile fails one or more criteria | Scholarship is not marked eligible; each unmet criterion is explained |
| TC-09 | FR-08/09 | Administrator adds or edits a scholarship and deadline | Changes are saved and reflected in listings |
| TC-10 | FR-09 | Scholarship deadline is in the past | Status is displayed according to the agreed active/expired rule |
| TC-11 | FR-10 | Submit missing or invalid field values | Input is rejected with a useful message |
| TC-12 | FR-11 | Student attempts administrator-only action | Access is denied |

**Note:** Detailed field-level values and boundary cases must be added after academic profile fields and criterion operators are finalized.
