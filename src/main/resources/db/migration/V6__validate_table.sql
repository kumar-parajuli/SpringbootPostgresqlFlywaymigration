ALTER TABLE Users
ADD CONSTRAINT check_mobile_length
CHECK (LENGTH(mobile) = 10);
