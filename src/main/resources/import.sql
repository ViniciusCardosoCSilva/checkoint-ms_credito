INSERT INTO tb_user (id, nome, email, cpf, telefone) VALUES (1, 'João Silva', 'joao@email.com', '12345678900', '111111111');
INSERT INTO tb_user (id, nome, email, cpf, telefone) VALUES (2, 'Maria Santos', 'maria@email.com', '09876543211', '222222222');
INSERT INTO tb_user (id, nome, email, cpf, telefone) VALUES (3, 'Carlos Lima', 'carlos@email.com', '56789012345', '333333333');

INSERT INTO tb_proposta (id, user_id, valor_solicitado, prazo_pagamento, aprovado) VALUES (1, 1, 5000.00, 24, false);
INSERT INTO tb_proposta (id, user_id, valor_solicitado, prazo_pagamento, aprovado) VALUES (2, 1, 10000.00, 36, false);
INSERT INTO tb_proposta (id, user_id, valor_solicitado, prazo_pagamento, aprovado) VALUES (3, 2, 7000.00, 24, false);
INSERT INTO tb_proposta (id, user_id, valor_solicitado, prazo_pagamento, aprovado) VALUES (4, 2, 15000.00, 48, false);
INSERT INTO tb_proposta (id, user_id, valor_solicitado, prazo_pagamento, aprovado) VALUES (5, 3, 2000.00, 12, false);
INSERT INTO tb_proposta (id, user_id, valor_solicitado, prazo_pagamento, aprovado) VALUES (6, 3, 8000.00, 30, false);
