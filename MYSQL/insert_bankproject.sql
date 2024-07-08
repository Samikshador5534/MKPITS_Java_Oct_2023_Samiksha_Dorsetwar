use bank_project;
INSERT INTO account (
    user_id, 
    account_type, 
    balance, 
    account_number, 
    rate_of_interest, 
    branch_id, 
    opening_date, 
    closing_date, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    1, -- user_id
    'Savings', -- account_type
    1000.00, -- balance
    '12345678901234', -- account_number
    4.50, -- rate_of_interest
    2, -- branch_id
    '2024-07-08', -- opening_date
    NULL, -- closing_date
    '2024-07-08 10:00:00', -- created_at
    1, -- created_by
    '2024-07-08 10:00:00', -- updated_at
    1 -- updated_by
);

INSERT INTO account (
    user_id, 
    account_type, 
    balance, 
    account_number, 
    rate_of_interest, 
    branch_id, 
    opening_date, 
    closing_date, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    2, -- user_id
    'Checking', -- account_type
    5000.00, -- balance
    '23456789012345', -- account_number
    3.75, -- rate_of_interest
    3, -- branch_id
    '2024-07-08', -- opening_date
    NULL, -- closing_date
    '2024-07-08 10:30:00', -- created_at
    2, -- created_by
    '2024-07-08 10:30:00', -- updated_at
    2 -- updated_by
);

INSERT INTO account (
    user_id, 
    account_type, 
    balance, 
    account_number, 
    rate_of_interest, 
    branch_id, 
    opening_date, 
    closing_date, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    3, -- user_id
    'Savings', -- account_type
    750.50, -- balance
    '34567890123456', -- account_number
    4.25, -- rate_of_interest
    4, -- branch_id
    '2024-07-08', -- opening_date
    NULL, -- closing_date
    '2024-07-08 11:00:00', -- created_at
    3, -- created_by
    '2024-07-08 11:00:00', -- updated_at
    3 -- updated_by
);


INSERT INTO state (
    name, 
    code, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    'California', -- name
    1, -- code
    '2024-07-08 10:00:00', -- created_at
    1, -- created_by
    '2024-07-08 10:00:00', -- updated_at
    1 -- updated_by
);

INSERT INTO state (
    name, 
    code, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    'Texas', -- name
    2, -- code
    '2024-07-08 10:30:00', -- created_at
    2, -- created_by
    '2024-07-08 10:30:00', -- updated_at
    2 -- updated_by
);

INSERT INTO state (
    name, 
    code, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    'New York', -- name
    3, -- code
    '2024-07-08 11:00:00', -- created_at
    3, -- created_by
    '2024-07-08 11:00:00', -- updated_at
    3 -- updated_by
);

INSERT INTO district (
    name, 
    code, 
    state_id, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    'Los Angeles', -- name
    101, -- code
    1, -- state_id (assuming California has id 1)
    '2024-07-08 14:00:00', -- created_at
    1, -- created_by
    '2024-07-08 14:00:00', -- updated_at
    1 -- updated_by
);

INSERT INTO district (
    name, 
    code, 
    state_id, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    'Houston', -- name
    102, -- code
    2, -- state_id (assuming Texas has id 2)
    '2024-07-08 14:30:00', -- created_at
    2, -- created_by
    '2024-07-08 14:30:00', -- updated_at
    2 -- updated_by
);

INSERT INTO district (
    name, 
    code, 
    state_id, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    'Manhattan', -- name
    103, -- code
    3, -- state_id (assuming New York has id 3)
    '2024-07-08 15:00:00', -- created_at
    3, -- created_by
    '2024-07-08 15:00:00', -- updated_at
    3 -- updated_by
);

INSERT INTO city (
    name, 
    code, 
    district_id, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    'Los Angeles', -- name
    1001, -- code
    1, -- district_id (assuming Los Angeles district has id 1)
    '2024-07-08 16:00:00', -- created_at
    1, -- created_by
    '2024-07-08 16:00:00', -- updated_at
    1 -- updated_by
);

INSERT INTO city (
    name, 
    code, 
    district_id, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    'Houston', -- name
    1002, -- code
    2, -- district_id (assuming Houston district has id 2)
    '2024-07-08 16:30:00', -- created_at
    2, -- created_by
    '2024-07-08 16:30:00', -- updated_at
    2 -- updated_by
);

INSERT INTO city (
    name, 
    code, 
    district_id, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    'New York City', -- name
    1003, -- code
    3, -- district_id (assuming Manhattan district has id 3)
    '2024-07-08 17:00:00', -- created_at
    3, -- created_by
    '2024-07-08 17:00:00', -- updated_at
    3 -- updated_by
);

INSERT INTO branch (
    name, 
    code, 
    ifsc_code, 
    city_id, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    'Downtown Branch', -- name
    101, -- code
    'IFSC001', -- ifsc_code
    1, -- city_id (assuming Los Angeles city has id 1)
    '2024-07-08 18:00:00', -- created_at
    1, -- created_by
    '2024-07-08 18:00:00', -- updated_at
    1 -- updated_by
);

INSERT INTO branch (
    name, 
    code, 
    ifsc_code, 
    city_id, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    'Central Branch', -- name
    102, -- code
    'IFSC002', -- ifsc_code
    2, -- city_id (assuming Houston city has id 2)
    '2024-07-08 18:30:00', -- created_at
    2, -- created_by
    '2024-07-08 18:30:00', -- updated_at
    2 -- updated_by
);

INSERT INTO branch (
    name, 
    code, 
    ifsc_code, 
    city_id, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    'Uptown Branch', -- name
    103, -- code
    'IFSC003', -- ifsc_code
    3, -- city_id (assuming New York City has id 3)
    '2024-07-08 19:00:00', -- created_at
    3, -- created_by
    '2024-07-08 19:00:00', -- updated_at
    3 -- updated_by
);


INSERT INTO transaction (
    user_id, 
    account_number, 
    remarks, 
    transaction_date_time, 
    transaction_type, 
    transaction_status, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    1, -- user_id
    '12345678901234', -- account_number
    'Salary Credit', -- remarks
    '2024-07-08 10:00:00', -- transaction_date_time
    'Credit', -- transaction_type
    'Completed', -- transaction_status
    '2024-07-08 10:00:00', -- created_at
    1, -- created_by
    '2024-07-08 10:00:00', -- updated_at
    1 -- updated_by
);

INSERT INTO transaction (
    user_id, 
    account_number, 
    remarks, 
    transaction_date_time, 
    transaction_type, 
    transaction_status, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    2, -- user_id
    '23456789012345', -- account_number
    'Bill Payment', -- remarks
    '2024-07-08 11:00:00', -- transaction_date_time
    'Debit', -- transaction_type
    'Completed', -- transaction_status
    '2024-07-08 11:00:00', -- created_at
    2, -- created_by
    '2024-07-08 11:00:00', -- updated_at
    2 -- updated_by
);

INSERT INTO transaction (
    user_id, 
    account_number, 
    remarks, 
    transaction_date_time, 
    transaction_type, 
    transaction_status, 
    created_at, 
    created_by, 
    updated_at, 
    updated_by
) VALUES (
    3, -- user_id
    '34567890123456', -- account_number
    'ATM Withdrawal', -- remarks
    '2024-07-08 12:00:00', -- transaction_date_time
    'Debit', -- transaction_type
    'Pending', -- transaction_status
    '2024-07-08 12:00:00', -- created_at
    3, -- created_by
    '2024-07-08 12:00:00', -- updated_at
    3 -- updated_by
);

INSERT INTO address (
    user_id, 
    address, 
    pincode, 
    city_id, 
    district_id, 
    state_id
) VALUES (
    1, -- user_id
    '123 Main St, Apt 4B', -- address
    '90001', -- pincode
    1, -- city_id (assuming Los Angeles city has id 1)
    1, -- district_id (assuming Los Angeles district has id 1)
    1 -- state_id (assuming California state has id 1)
);

INSERT INTO address (
    user_id, 
    address, 
    pincode, 
    city_id, 
    district_id, 
    state_id
) VALUES (
    2, -- user_id
    '456 Elm St, Suite 300', -- address
    '77002', -- pincode
    2, -- city_id (assuming Houston city has id 2)
    2, -- district_id (assuming Houston district has id 2)
    2 -- state_id (assuming Texas state has id 2)
);

INSERT INTO address (
    user_id, 
    address, 
    pincode, 
    city_id, 
    district_id, 
    state_id
) VALUES (
    3, -- user_id
    '789 Oak St, Floor 5', -- address
    '10001', -- pincode
    3, -- city_id (assuming New York City has id 3)
    3, -- district_id (assuming Manhattan district has id 3)
    3 -- state_id (assuming New York state has id 3)
);

