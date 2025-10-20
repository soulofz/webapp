CREATE TABLE custom_operations
(
    id             bigserial PRIMARY KEY,
    user_id        BIGINT NOT NULL,
    operation_id   BIGINT NOT NULL,
    operation_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (operation_id) REFERENCES operations (id) ON DELETE CASCADE
);

CREATE INDEX idx_custom_operations_user_id ON custom_operations(user_id);
CREATE INDEX idx_custom_operations_operation_id ON custom_operations(operation_id);
CREATE INDEX idx_custom_operations_operation_time ON custom_operations(operation_time);
CREATE INDEX idx_custom_operations_user_operation ON custom_operations(user_id, operation_id);