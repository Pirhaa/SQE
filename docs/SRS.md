# Software Requirements Specification (SRS)

## 1. Purpose
ScholarMatch is a desktop application that centralizes scholarship records and compares a student's academic profile with predefined eligibility criteria.

## 2. User classes
- **Student:** registers, logs in, maintains an academic profile, searches scholarships, views eligibility and deadlines, and sees unmet criteria.
- **Administrator:** manages scholarship records, eligibility criteria, deadlines, and active/expired status.

## 3. Functional requirements
- FR-01: The system shall allow a student to register and log in.
- FR-02: The system shall allow a student to create and update an academic profile.
- FR-03: The system shall allow students to search and filter scholarship records.
- FR-04: The system shall display scholarship details and application deadlines.
- FR-05: The system shall compare a student profile with predefined scholarship criteria.
- FR-06: The system shall display eligible scholarships.
- FR-07: The system shall explain unmet criteria for scholarships for which the student is ineligible.
- FR-08: An administrator shall add, update, and manage scholarship records and criteria.
- FR-09: An administrator shall manage deadlines and active/expired status.
- FR-10: The system shall validate user input and show clear error messages.
- FR-11: The system shall enforce role-based access and store hashed passwords.

## 4. Non-functional requirements
- NFR-01: The desktop interface shall be understandable and consistent.
- NFR-02: Invalid input shall be handled without an unhandled application crash.
- NFR-03: Passwords shall not be stored as plain text.
- NFR-04: Eligibility outcomes shall be repeatable for the same profile and criteria.
- NFR-05: Core eligibility logic shall be unit-testable.

## 5. Scope boundaries
No external application submission, payment processing, external APIs/platforms, scraping, document upload/verification, email/SMS notifications, or AI/ML recommendations.

## 6. Constraints and assumptions
Scholarship records are entered manually by administrators. Students enter their own academic details; the system does not verify official records. The proposal schedules the work over six weeks.

## 7. Open decisions
The proposal does not specify the final academic fields, complete criterion operators, password-hashing library, or detailed screen designs. These must be agreed and documented before implementation.
