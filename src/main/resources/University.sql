-- MySQL Script generated by MySQL Workbench
-- 12/08/16 20:53:45
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema universityapp
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema universityapp
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `universityapp` DEFAULT CHARACTER SET utf8 ;
USE `universityapp` ;

-- -----------------------------------------------------
-- Table `universityapp`.`professor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universityapp`.`professor` (
  `professor_id` INT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(60) NOT NULL,
  `e_mail` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`professor_id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC),
  UNIQUE INDEX `e_mail_UNIQUE` (`e_mail` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `universityapp`.`university`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universityapp`.`university` (
  `university_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `region` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `zip_code` VARCHAR(45) NOT NULL,
  `rector_id` INT NOT NULL,
  `first_prorector_id` INT NOT NULL,
  `second_prorector_id` INT NOT NULL,
  PRIMARY KEY (`university_id`),
  INDEX `university_rector_idx` (`rector_id` ASC),
  INDEX `university_first_prorector_idx` (`first_prorector_id` ASC),
  INDEX `university_second_prorector_idx` (`second_prorector_id` ASC),
  CONSTRAINT `university_rector`
    FOREIGN KEY (`rector_id`)
    REFERENCES `universityapp`.`professor` (`professor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `university_first_prorector`
    FOREIGN KEY (`first_prorector_id`)
    REFERENCES `universityapp`.`professor` (`professor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `university_second_prorector`
    FOREIGN KEY (`second_prorector_id`)
    REFERENCES `universityapp`.`professor` (`professor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `universityapp`.`faculty`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universityapp`.`faculty` (
  `faculty_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `university_id` INT NOT NULL,
  `building_corpus` INT NOT NULL,
  `decan_id` INT NOT NULL,
  `prodecan_id` INT NOT NULL,
  `decan_room_number` INT NOT NULL,
  `phon` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`faculty_id`),
  INDEX `university_university_id_idx` (`university_id` ASC),
  INDEX `faculty_decan_idx` (`decan_id` ASC),
  INDEX `faculty_prodecan_idx` (`prodecan_id` ASC),
  CONSTRAINT `university_university_id`
    FOREIGN KEY (`university_id`)
    REFERENCES `universityapp`.`university` (`university_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `faculty_decan`
    FOREIGN KEY (`decan_id`)
    REFERENCES `universityapp`.`professor` (`professor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `faculty_prodecan`
    FOREIGN KEY (`prodecan_id`)
    REFERENCES `universityapp`.`professor` (`professor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `universityapp`.`group`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universityapp`.`group` (
  `group_id` INT NOT NULL AUTO_INCREMENT,
  `group_number` INT NOT NULL,
  `faculty_id` INT NOT NULL,
  PRIMARY KEY (`group_id`),
  INDEX `faculty_faculty_id_idx` (`faculty_id` ASC),
  UNIQUE INDEX `group_number_UNIQUE` (`group_number` ASC),
  CONSTRAINT `faculty_faculty_id`
    FOREIGN KEY (`faculty_id`)
    REFERENCES `universityapp`.`faculty` (`faculty_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `universityapp`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universityapp`.`student` (
  `student_id` INT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(60) NOT NULL,
  `e_mail` VARCHAR(60) NOT NULL,
  `study_year` ENUM('FIRST', 'SECOND', 'THIRD', 'FOURTH') NOT NULL,
  `study_semester` ENUM('FIRST', 'SECOND') NOT NULL,
  `group_id` INT NOT NULL,
  PRIMARY KEY (`student_id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC),
  UNIQUE INDEX `e_mail_UNIQUE` (`e_mail` ASC),
  INDEX `group_groupid_idx` (`group_id` ASC),
  CONSTRAINT `group_groupid`
    FOREIGN KEY (`group_id`)
    REFERENCES `universityapp`.`group` (`group_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `universityapp`.`course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universityapp`.`course` (
  `course_id` INT NOT NULL AUTO_INCREMENT,
  `subject` VARCHAR(45) NOT NULL,
  `professor_id` INT NOT NULL,
  PRIMARY KEY (`course_id`),
  INDEX `professor_professor_id_idx` (`professor_id` ASC),
  UNIQUE INDEX `subject_UNIQUE` (`subject` ASC),
  CONSTRAINT `professor_professor_id`
    FOREIGN KEY (`professor_id`)
    REFERENCES `universityapp`.`professor` (`professor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `universityapp`.`group_course_map`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universityapp`.`group_course_map` (
  `group_course_map_id` INT NOT NULL,
  `group_id` INT NOT NULL,
  `course_id` INT NOT NULL,
  PRIMARY KEY (`group_course_map_id`),
  INDEX `group_group_id_idx` (`group_id` ASC),
  INDEX `course_course_id_idx` (`course_id` ASC),
  CONSTRAINT `group_group_id`
    FOREIGN KEY (`group_id`)
    REFERENCES `universityapp`.`group` (`group_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `course_course_id`
    FOREIGN KEY (`course_id`)
    REFERENCES `universityapp`.`course` (`course_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `universityapp`.`course_time`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universityapp`.`course_time` (
  `course_time_id` INT NOT NULL AUTO_INCREMENT,
  `course_id` INT NOT NULL,
  `week_day` ENUM('MONDAY', 'TUESDAY', 'WEDNESDAY', 'THURSDAY', 'FRIDAY') NOT NULL,
  `time` ENUM('FIRST', 'SECOND', 'THIRD', 'FOURTH', 'FIFTH', 'SIXTH', 'SEVENTH') NOT NULL,
  `auditorium_num` INT NOT NULL,
  PRIMARY KEY (`course_time_id`),
  INDEX `course_course__id_idx` (`course_id` ASC),
  CONSTRAINT `course_course__id`
    FOREIGN KEY (`course_id`)
    REFERENCES `universityapp`.`course` (`course_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
