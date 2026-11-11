CREATE DATABASE IF NOT EXISTS scholarmatch;
USE scholarmatch;

CREATE TABLE IF NOT EXISTS users (
    user_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(120) NOT NULL,
    email VARCHAR(190) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    role ENUM('STUDENT', 'ADMIN') NOT NULL DEFAULT 'STUDENT',
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS student_profiles (
    profile_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT NOT NULL UNIQUE,
    institution VARCHAR(180),
    degree_program VARCHAR(120),
    current_semester INT,
    cgpa DECIMAL(4,2),
    domicile VARCHAR(120),
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    CONSTRAINT fk_profile_user FOREIGN KEY (user_id) REFERENCES users(user_id),
    CONSTRAINT chk_semester CHECK (current_semester IS NULL OR current_semester >= 1),
    CONSTRAINT chk_cgpa CHECK (cgpa IS NULL OR (cgpa >= 0 AND cgpa <= 4))
);

CREATE TABLE IF NOT EXISTS scholarships (
    scholarship_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(180) NOT NULL,
    provider VARCHAR(180) NOT NULL,
    description TEXT,
    application_deadline DATE,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS eligibility_criteria (
    criterion_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    scholarship_id BIGINT NOT NULL,
    field_name VARCHAR(80) NOT NULL,
    operator VARCHAR(12) NOT NULL,
    expected_value VARCHAR(180) NOT NULL,
    explanation VARCHAR(500) NOT NULL,
    CONSTRAINT fk_criteria_scholarship FOREIGN KEY (scholarship_id)
        REFERENCES scholarships(scholarship_id) ON DELETE CASCADE
);

CREATE INDEX idx_scholarships_deadline ON scholarships(application_deadline);
CREATE INDEX idx_scholarships_active ON scholarships(is_active);

-- Initial schema only. Final profile fields, criterion operators, and validation
-- rules must be confirmed by the team before implementing the matching engine.
