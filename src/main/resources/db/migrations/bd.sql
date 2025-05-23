CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    password VARCHAR(255) NOT NULL
    );

CREATE TABLE IF NOT EXISTS flower (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price BIGINT NOT NULL,
    quantity INTEGER NOT NULL,
    description TEXT,
    image_url VARCHAR(255),
    created_at TIMESTAMP DEFAULT NOW()
    );

CREATE TABLE IF NOT EXISTS category (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT NOW()
    );

CREATE TABLE IF NOT EXISTS flower_category (
    flower_id INTEGER REFERENCES flower(id) ON DELETE CASCADE,
    category_id INTEGER REFERENCES category(id) ON DELETE CASCADE
    );

INSERT INTO flower (name, quantity, price, description, image_url) VALUES
('Розы Красные', 20, 1500, 'Классический букет красных роз', 'https://example.com/rose.jpg'),
('Тюльпаны Весенние', 30, 1200, 'Разноцветные тюльпаны', 'https://example.com/tulip.jpg'),
('Орхидеи Королевские', 10, 3000, 'Орхидеи в горшке', 'https://example.com/orchid.jpg'),
('Лилии Белоснежные', 15, 2000, 'Ароматные белые лилии', 'https://example.com/lily.jpg'),
('Хризантемы Праздничные', 25, 1000, 'Яркий букет хризантем', 'https://example.com/chrysanthemum.jpg');

INSERT INTO category (name) VALUES
('Букеты'),
('Комнатные растения'),
('Экзотические цветы');

INSERT INTO flower_category VALUES (1, 1);
INSERT INTO flower_category VALUES (2, 3);
INSERT INTO flower_category VALUES (3, 4);
INSERT INTO flower_category VALUES (4, 1);
INSERT INTO flower_category VALUES (5, 3);