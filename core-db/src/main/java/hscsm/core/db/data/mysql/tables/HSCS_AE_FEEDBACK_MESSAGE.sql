ALTER TABLE hscs_ae_feedback_message
ADD UNIQUE INDEX `SUM_ACCOUNT_ID_INDEX` (`TFR_SUM_ACCOUNT_ID`) USING BTREE;